package jp.primecloud.auto.sdk;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.BooleanUtils;

public class TestFactory {

    private static Requester requester;

    private static Pcc pcc;

    static {
        Properties properties = new Properties();
        try {
            properties.load(TestFactory.class.getResourceAsStream("/test.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String url = properties.getProperty("url");
        String accessId = properties.getProperty("accessId");
        String accessKey = properties.getProperty("accessKey");
        String ignoreCerts = properties.getProperty("ignoreCerts");

        PccOptions options = new PccOptions();
        options.withIgnoreCerts(BooleanUtils.toBooleanObject(ignoreCerts));

        requester = new Requester(url, accessId, accessKey, options);
        pcc = new Pcc(requester);
    }

    public static Requester getRequester() {
        return requester;
    }

    public static Pcc getPcc() {
        return pcc;
    }

}
