package jp.primecloud.auto.sdk.client.farm;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class CreateFarm {

    protected Requester requester;

    public CreateFarm(Requester requester) {
        this.requester = requester;
    }

    public Long execute(String farmName, Long templateNo, String comment) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmName", farmName);
        parameters.put("TemplateNo", templateNo.toString());

        if (comment != null) {
            parameters.put("Comment", comment);
        }

        JsonNode jsonNode = requester.execute("/CreateFarm", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "FarmNo");

        return JacksonUtils.toObject(jsonNode, new TypeReference<Long>() {
        });
    }

}
