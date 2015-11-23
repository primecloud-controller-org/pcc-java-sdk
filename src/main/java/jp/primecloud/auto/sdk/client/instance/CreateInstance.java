package jp.primecloud.auto.sdk.client.instance;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.CreateInstanceParameter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class CreateInstance {

    protected Requester requester;

    public CreateInstance(Requester requester) {
        this.requester = requester;
    }

    public Long execute(CreateInstanceParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", parameter.getFarmNo().toString());
        parameters.put("InstanceName", parameter.getInstanceName());
        parameters.put("ImageNo", parameter.getImageNo().toString());

        if (parameter.getComment() != null) {
            parameters.put("Comment", parameter.getComment());
        }

        if (parameter.getInstanceType() != null) {
            parameters.put("InstanceType", parameter.getInstanceType());
        }

        JsonNode jsonNode = requester.execute("/CreateInstance", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "InstanceNo");

        return JacksonUtils.toObject(jsonNode, new TypeReference<Long>() {
        });
    }

}
