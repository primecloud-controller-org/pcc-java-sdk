package jp.primecloud.auto.sdk.client.component;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.component.ComponentType;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NullNode;

public class ListComponentType {

    protected Requester requester;

    public ListComponentType(Requester requester) {
        this.requester = requester;
    }

    public List<ComponentType> execute(Long farmNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());

        JsonNode jsonNode = requester.execute("/ListComponentType", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "ComponentTypes");

        if (jsonNode == null || jsonNode instanceof NullNode) {
            return new ArrayList<ComponentType>();
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<ComponentType>>() {
        });
    }

}
