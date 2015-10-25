package jp.primecloud.auto.sdk.client.image;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.Image;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ListImage {

    protected Requester requester;

    public ListImage(Requester requester) {
        this.requester = requester;
    }

    public List<Image> execute(Long farmNo, Long platformNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());
        parameters.put("PlatformNo", platformNo.toString());

        JsonNode jsonNode = requester.execute("/ListImage", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "Images.Image");

        if (jsonNode == null) {
            return new ArrayList<Image>();
        }

        if (jsonNode instanceof ObjectNode) {
            Image image = JacksonUtils.toObject(jsonNode, new TypeReference<Image>() {
            });
            return Arrays.asList(image);
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<Image>>() {
        });
    }

}
