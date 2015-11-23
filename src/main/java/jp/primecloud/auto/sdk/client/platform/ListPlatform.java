package jp.primecloud.auto.sdk.client.platform;

import java.util.ArrayList;
import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.platform.Platform;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NullNode;

public class ListPlatform {

    protected Requester requester;

    public ListPlatform(Requester requester) {
        this.requester = requester;
    }

    public List<Platform> execute() {
        JsonNode jsonNode = requester.execute("/ListPlatform");
        jsonNode = JacksonUtils.getField(jsonNode, "Platforms");

        if (jsonNode == null || jsonNode instanceof NullNode) {
            return new ArrayList<Platform>();
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<Platform>>() {
        });
    }

}
