package jp.primecloud.auto.sdk.client.address;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.address.AwsAddress;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class AddAwsAddress {

    protected Requester requester;

    public AddAwsAddress(Requester requester) {
        this.requester = requester;
    }

    public AwsAddress execute(Long platformNo, Long farmNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("PlatformNo", platformNo.toString());
        parameters.put("FarmNo", farmNo.toString());

        JsonNode jsonNode = requester.execute("/AddAwsAddress", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "AwsAddress");

        return JacksonUtils.toObject(jsonNode, new TypeReference<AwsAddress>() {
        });
    }

}
