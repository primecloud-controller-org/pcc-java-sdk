package jp.primecloud.auto.sdk.client.component;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class DetachComponent {

    protected Requester requester;

    public DetachComponent(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long componentNo, Long instanceNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("ComponentNo", componentNo.toString());
        parameters.put("InstanceNo", instanceNo.toString());

        requester.execute("/DetachComponent", parameters);
    }

}
