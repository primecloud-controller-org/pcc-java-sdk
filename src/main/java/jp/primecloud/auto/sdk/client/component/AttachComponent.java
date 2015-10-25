package jp.primecloud.auto.sdk.client.component;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class AttachComponent {

    protected Requester requester;

    public AttachComponent(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long farmNo, Long componentNo, Long instanceNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());
        parameters.put("ComponentNo", componentNo.toString());
        parameters.put("InstanceNo", instanceNo.toString());

        requester.execute("/AttachComponent", parameters);
    }

}
