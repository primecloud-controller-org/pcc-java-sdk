package jp.primecloud.auto.sdk.client.farm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.Farm;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ListFarm {

    protected Requester requester;

    public ListFarm(Requester requester) {
        this.requester = requester;
    }

    public List<Farm> execute() {
        JsonNode jsonNode = requester.execute("/ListFarm");
        jsonNode = JacksonUtils.getField(jsonNode, "Farms.Farm");

        if (jsonNode == null) {
            return new ArrayList<Farm>();
        }

        if (jsonNode instanceof ObjectNode) {
            Farm farm = JacksonUtils.toObject(jsonNode, new TypeReference<Farm>() {
            });
            return Arrays.asList(farm);
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<Farm>>() {
        });
    }

}
