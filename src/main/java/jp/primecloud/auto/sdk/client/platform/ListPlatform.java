package jp.primecloud.auto.sdk.client.platform;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.Platform;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ListPlatform {

    protected Requester requester;

    public ListPlatform(Requester requester) {
        this.requester = requester;
    }

    public List<Platform> execute(Long farmNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());

        JsonNode jsonNode = requester.execute("/ListPlatform", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "Platforms.Platform");

        if (jsonNode == null) {
            return new ArrayList<Platform>();
        }

        if (jsonNode instanceof ObjectNode) {
            Platform platform = JacksonUtils.toObject(jsonNode, new TypeReference<Platform>() {
            });
            return Arrays.asList(platform);
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<Platform>>() {
        });
    }

}
