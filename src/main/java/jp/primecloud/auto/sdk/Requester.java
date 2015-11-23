package jp.primecloud.auto.sdk;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.codec.digest.HmacUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Requester {

    private static Log log = LogFactory.getLog(Requester.class);

    protected String url;

    protected String accessId;

    protected String accessKey;

    protected PccOptions options;

    protected String apiPath = "/rest";

    protected static final Pattern errorMessagePattern = Pattern.compile("\\[(.*?)\\] (.*)");

    public Requester(String url, String accessId, String accessKey, PccOptions options) {
        this.url = url.endsWith("/") ? url.substring(0, url.length() - 1) : url;
        this.accessId = accessId;
        this.accessKey = accessKey;
        this.options = options;
    }

    public JsonNode execute(String endpoint) {
        return execute(endpoint, null);
    }

    public JsonNode execute(String endpoint, Map<String, String> parameters) {
        String body = request(endpoint, parameters);

        JsonNode jsonNode = JacksonUtils.readTree(body);

        boolean success = jsonNode.get("SUCCESS").asBoolean();
        if (!success) {
            String message = jsonNode.get("Message").asText();
            String code = null;

            Matcher matcher = errorMessagePattern.matcher(message);
            if (matcher.find()) {
                code = matcher.group(1);
            }

            throw new ApiException(code, message);
        }

        ((ObjectNode) jsonNode).remove("SUCCESS");

        return jsonNode;
    }

    protected String request(String endpoint, Map<String, String> parameters) {
        String queryString = createQueryString(apiPath + endpoint, parameters);
        String url = this.url + apiPath + endpoint + "?" + queryString;

        log.trace("[API Request] " + url);

        HttpURLConnection connection;
        try {
            connection = createConnection(url, options);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            int code = connection.getResponseCode();
            if (code != 200) {
                throw new RuntimeException(connection.getResponseMessage());
            }

            String body = IOUtils.toString(connection.getInputStream(), StandardCharsets.UTF_8);

            log.trace("[API Response] " + body);

            return body;

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            connection.disconnect();
        }
    }

    protected String createQueryString(String endpointPath, Map<String, String> parameters) {
        StringBuilder param = new StringBuilder();
        param.append("AccessId=").append(accessId);
        param.append("&Timestamp=").append(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));

        if (parameters != null && !parameters.isEmpty()) {
            for (Map.Entry<String, String> parameter : parameters.entrySet()) {
                param.append("&").append(parameter.getKey()).append("=").append(parameter.getValue());
            }
        }

        String signature = HmacUtils.hmacSha256Hex(accessKey, endpointPath + "?" + param.toString());

        param.append("&Signature=").append(signature);

        String queryString = Base64.getEncoder().encodeToString(param.toString().getBytes(StandardCharsets.UTF_8));

        return queryString;
    }

    protected HttpURLConnection createConnection(String url, PccOptions options) throws IOException,
            GeneralSecurityException {
        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        if (options != null) {
            // HTTPSの検証を無効化
            if (connection instanceof HttpsURLConnection && Boolean.TRUE.equals(options.getIgnoreCerts())) {
                HttpsURLConnection connection2 = (HttpsURLConnection) connection;

                // 証明書の検証を無効化
                X509TrustManager trustManager = new X509TrustManager() {
                    @Override
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    @Override
                    public void checkServerTrusted(X509Certificate[] chain, String authType)
                            throws CertificateException {
                    }

                    @Override
                    public void checkClientTrusted(X509Certificate[] chain, String authType)
                            throws CertificateException {
                    }
                };
                SSLContext sslcontext = SSLContext.getInstance("SSL");
                sslcontext.init(null, new TrustManager[] { trustManager }, null);
                connection2.setSSLSocketFactory(sslcontext.getSocketFactory());

                // ホスト名の検証を無効化
                connection2.setHostnameVerifier(new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                });
            }
        }

        return connection;
    }

}
