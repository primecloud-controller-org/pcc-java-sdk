package jp.primecloud.auto.sdk.client.address;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class EditAwsAddress {

    protected Requester requester;

    public EditAwsAddress(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long addressNo, String comment) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("AddressNo", addressNo.toString());
        parameters.put("Comment", comment);

        requester.execute("/EditAwsAddress", parameters);
    }

}
