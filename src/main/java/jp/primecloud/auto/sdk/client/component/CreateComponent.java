package jp.primecloud.auto.sdk.client.component;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.CreateComponentParameter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class CreateComponent {

    protected Requester requester;

    public CreateComponent(Requester requester) {
        this.requester = requester;
    }

    public Long execute(CreateComponentParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", parameter.getFarmNo().toString());
        parameters.put("ComponentName", parameter.getComponentName());
        parameters.put("ComponentTypeNo", parameter.getComponentTypeNo().toString());
        parameters.put("DiskSize", parameter.getDiskSize().toString());

        if (parameter.getComment() != null) {
            parameters.put("Comment", parameter.getComment());
        }

        JsonNode jsonNode = requester.execute("/CreateComponent", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "ComponentNo");

        return JacksonUtils.toObject(jsonNode, new TypeReference<Long>() {
        });
    }

}
