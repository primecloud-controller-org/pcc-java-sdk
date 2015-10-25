package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.EditLoadBalancerHealthCheckParameter;

public class EditLoadBalancerHealthCheck {

    protected Requester requester;

    public EditLoadBalancerHealthCheck(Requester requester) {
        this.requester = requester;
    }

    public void execute(EditLoadBalancerHealthCheckParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", parameter.getFarmNo().toString());
        parameters.put("LoadBalancerNo", parameter.getLoadBalancerNo().toString());
        parameters.put("CheckProtocol", parameter.getCheckProtocol());
        parameters.put("CheckPort", parameter.getCheckPort().toString());
        parameters.put("CheckTimeout", parameter.getCheckTimeout().toString());
        parameters.put("CheckInterval", parameter.getCheckInterval().toString());
        parameters.put("HealthyThreshold", parameter.getHealthyThreshold().toString());
        parameters.put("UnhealthyThreshold", parameter.getUnhealthyThreshold().toString());

        if (parameter.getCheckPath() != null) {
            parameters.put("CheckPath", parameter.getCheckPath());
        }

        requester.execute("/EditLoadBalancerHealthCheck", parameters);
    }

}
