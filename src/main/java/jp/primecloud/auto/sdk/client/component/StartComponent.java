package jp.primecloud.auto.sdk.client.component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

import org.apache.commons.lang.StringUtils;

public class StartComponent {

    protected Requester requester;

    public StartComponent(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long componentNo, List<Long> instanceNos) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("ComponentNo", componentNo.toString());
        parameters.put("InstanceNos", StringUtils.join(instanceNos, ","));

        requester.execute("/StartComponent", parameters);
    }

}
