package jp.primecloud.auto.sdk.client.component;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.component.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class DescribeComponent {

    protected Requester requester;

    public DescribeComponent(Requester requester) {
        this.requester = requester;
    }

    public Component execute(Long componentNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("ComponentNo", componentNo.toString());

        JsonNode jsonNode = requester.execute("/DescribeComponent", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "Component");

        return JacksonUtils.toObject(jsonNode, new TypeReference<Component>() {
        });
    }

}
