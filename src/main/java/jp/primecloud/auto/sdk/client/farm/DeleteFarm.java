package jp.primecloud.auto.sdk.client.farm;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class DeleteFarm {

    protected Requester requester;

    public DeleteFarm(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long farmNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());

        requester.execute("/DeleteFarm", parameters);
    }

}
