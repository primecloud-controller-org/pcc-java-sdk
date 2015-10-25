package jp.primecloud.auto.sdk.client.farm;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class EditFarm {

    protected Requester requester;

    public EditFarm(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long farmNo, String comment) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());

        if (comment != null) {
            parameters.put("Comment", comment);
        }

        requester.execute("/EditFarm", parameters);
    }

}
