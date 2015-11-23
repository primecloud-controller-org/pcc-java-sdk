package jp.primecloud.auto.sdk.client.address;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.address.AwsAddress;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.NullNode;

public class ListAwsAddress {

    protected Requester requester;

    public ListAwsAddress(Requester requester) {
        this.requester = requester;
    }

    public List<AwsAddress> execute(Long platformNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("PlatformNo", platformNo.toString());

        JsonNode jsonNode = requester.execute("/ListAwsAddress", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "AwsAddresses");

        if (jsonNode == null || jsonNode instanceof NullNode) {
            return new ArrayList<AwsAddress>();
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<AwsAddress>>() {
        });
    }

}
