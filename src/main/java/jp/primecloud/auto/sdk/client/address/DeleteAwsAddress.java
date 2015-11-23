package jp.primecloud.auto.sdk.client.address;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class DeleteAwsAddress {

    protected Requester requester;

    public DeleteAwsAddress(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long addressNo, Long farmNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("AddressNo", addressNo.toString());
        parameters.put("FarmNo", farmNo.toString());

        requester.execute("/DeleteAwsAddress", parameters);
    }

}
