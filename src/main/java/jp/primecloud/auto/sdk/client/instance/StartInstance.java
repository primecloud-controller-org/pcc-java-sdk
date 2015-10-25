package jp.primecloud.auto.sdk.client.instance;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class StartInstance {

    protected Requester requester;

    public StartInstance(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long farmNo, Long instanceNo) {
        execute(farmNo, instanceNo, null);
    }

    public void execute(Long farmNo, Long instanceNo, Boolean isStartService) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());
        parameters.put("InstanceNo", instanceNo.toString());

        if (isStartService != null) {
            parameters.put("IsStartService", isStartService.toString());
        }

        requester.execute("/StartInstance", parameters);
    }

}
