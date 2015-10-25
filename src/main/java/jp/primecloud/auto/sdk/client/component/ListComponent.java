package jp.primecloud.auto.sdk.client.component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ListComponent {

    protected Requester requester;

    public ListComponent(Requester requester) {
        this.requester = requester;
    }

    public List<Component> execute(Long farmNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());

        JsonNode jsonNode = requester.execute("/ListComponent", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "Components.Component");

        if (jsonNode == null) {
            return new ArrayList<Component>();
        }

        if (jsonNode instanceof ObjectNode) {
            Component component = JacksonUtils.toObject(jsonNode, new TypeReference<Component>() {
            });
            return Arrays.asList(component);
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<Component>>() {
        });
    }

}
