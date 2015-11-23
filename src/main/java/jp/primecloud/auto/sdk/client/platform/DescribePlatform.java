package jp.primecloud.auto.sdk.client.platform;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.platform.Platform;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class DescribePlatform {

    protected Requester requester;

    public DescribePlatform(Requester requester) {
        this.requester = requester;
    }

    public Platform execute(Long platformNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("PlatformNo", platformNo.toString());

        JsonNode jsonNode = requester.execute("/DescribePlatform", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "Platform");

        return JacksonUtils.toObject(jsonNode, new TypeReference<Platform>() {
        });
    }

}
