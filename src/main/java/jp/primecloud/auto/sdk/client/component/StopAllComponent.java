package jp.primecloud.auto.sdk.client.component;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class StopAllComponent {

    protected Requester requester;

    public StopAllComponent(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long farmNo) {
        execute(farmNo, null);
    }

    public void execute(Long farmNo, Boolean isStopInstance) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());

        if (isStopInstance != null) {
            parameters.put("IsStopInstance", isStopInstance.toString());
        }

        requester.execute("/StopAllComponent", parameters);
    }

}
