package jp.primecloud.auto.sdk.client.image;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.image.Image;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NullNode;

public class ListImage {

    protected Requester requester;

    public ListImage(Requester requester) {
        this.requester = requester;
    }

    public List<Image> execute(Long platformNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("PlatformNo", platformNo.toString());

        JsonNode jsonNode = requester.execute("/ListImage", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "Images");

        if (jsonNode == null || jsonNode instanceof NullNode) {
            return new ArrayList<Image>();
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<Image>>() {
        });
    }

}
