package jp.primecloud.auto.sdk.client.instance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.Instance;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ListInstance {

    protected Requester requester;

    public ListInstance(Requester requester) {
        this.requester = requester;
    }

    public List<Instance> execute(Long farmNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());

        JsonNode jsonNode = requester.execute("/ListInstance", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "Instances.Instance");

        if (jsonNode == null) {
            return new ArrayList<Instance>();
        }

        if (jsonNode instanceof ObjectNode) {
            Instance instance = JacksonUtils.toObject(jsonNode, new TypeReference<Instance>() {
            });
            return Arrays.asList(instance);
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<Instance>>() {
        });
    }

}
