package jp.primecloud.auto.sdk.client.component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

import org.apache.commons.lang.StringUtils;

public class StopComponent {

    protected Requester requester;

    public StopComponent(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long farmNo, Long componentNo, List<Long> instanceNos) {
        execute(farmNo, componentNo, instanceNos, null);
    }

    public void execute(Long farmNo, Long componentNo, List<Long> instanceNos, Boolean isStopInstance) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());
        parameters.put("ComponentNo", componentNo.toString());
        parameters.put("InstanceNos", StringUtils.join(instanceNos, ","));

        if (isStopInstance != null) {
            parameters.put("IsStopInstance", isStopInstance.toString());
        }

        requester.execute("/StopComponent", parameters);
    }

}
