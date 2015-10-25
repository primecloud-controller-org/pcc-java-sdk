package jp.primecloud.auto.sdk.client.component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.Component;
import jp.primecloud.auto.sdk.model.ComponentInstance;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DescribeComponent {

    protected Requester requester;

    public DescribeComponent(Requester requester) {
        this.requester = requester;
    }

    public Component execute(Long farmNo, Long componentNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());
        parameters.put("ComponentNo", componentNo.toString());

        JsonNode jsonNode = requester.execute("/DescribeComponent", parameters);

        JsonNode jsonNode2 = JacksonUtils.getField(jsonNode, "Instances.Instance");
        ((ObjectNode) jsonNode).remove("Instances");

        Component component = JacksonUtils.toObject(jsonNode, new TypeReference<Component>() {
        });

        if (jsonNode2 == null) {
            component.setInstances(new ArrayList<ComponentInstance>());
        } else if (jsonNode2 instanceof ObjectNode) {
            ComponentInstance instance = JacksonUtils.toObject(jsonNode2, new TypeReference<ComponentInstance>() {
            });
            component.setInstances(Arrays.asList(instance));
        } else {
            List<ComponentInstance> instances = JacksonUtils.toObject(jsonNode2,
                    new TypeReference<List<ComponentInstance>>() {
                    });
            component.setInstances(instances);
        }

        return component;
    }

}
