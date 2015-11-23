package jp.primecloud.auto.sdk.client.component;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class DeleteComponent {

    protected Requester requester;

    public DeleteComponent(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long componentNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("ComponentNo", componentNo.toString());

        requester.execute("/DeleteComponent", parameters);
    }

}
