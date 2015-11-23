package jp.primecloud.auto.sdk.client.component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.component.ComponentInstance;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NullNode;

public class GetAttachableComponent {

    protected Requester requester;

    public GetAttachableComponent(Requester requester) {
        this.requester = requester;
    }

    public List<ComponentInstance> execute(Long componentNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("ComponentNo", componentNo.toString());

        JsonNode jsonNode = requester.execute("/GetAttachableComponent", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "Instances");

        if (jsonNode == null || jsonNode instanceof NullNode) {
            return new ArrayList<ComponentInstance>();
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<ComponentInstance>>() {
        });
    }

}
