package jp.primecloud.auto.sdk.client.instance;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class StartAllInstance {

    protected Requester requester;

    public StartAllInstance(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long farmNo) {
        execute(farmNo, null);
    }

    public void execute(Long farmNo, Boolean isStartService) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());

        if (isStartService != null) {
            parameters.put("IsStartService", isStartService.toString());
        }

        requester.execute("/StartAllInstance", parameters);
    }

}
