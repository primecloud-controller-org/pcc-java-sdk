package jp.primecloud.auto.sdk.client.farm;

import java.util.ArrayList;
import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.farm.Farm;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NullNode;

public class ListFarm {

    protected Requester requester;

    public ListFarm(Requester requester) {
        this.requester = requester;
    }

    public List<Farm> execute() {
        JsonNode jsonNode = requester.execute("/ListFarm");
        jsonNode = JacksonUtils.getField(jsonNode, "Farms");

        if (jsonNode == null || jsonNode instanceof NullNode) {
            return new ArrayList<Farm>();
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<Farm>>() {
        });
    }

}
