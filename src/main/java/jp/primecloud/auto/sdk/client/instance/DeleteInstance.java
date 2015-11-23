package jp.primecloud.auto.sdk.client.instance;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class DeleteInstance {

    protected Requester requester;

    public DeleteInstance(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long instanceNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("InstanceNo", instanceNo.toString());

        requester.execute("/DeleteInstance", parameters);
    }

}
