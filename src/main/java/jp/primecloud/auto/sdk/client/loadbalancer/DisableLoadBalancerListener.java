package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class DisableLoadBalancerListener {

    protected Requester requester;

    public DisableLoadBalancerListener(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long loadBalancerNo, Integer loadBalancerPort) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("LoadBalancerNo", loadBalancerNo.toString());
        parameters.put("LoadBalancerPort", loadBalancerPort.toString());

        requester.execute("/DisableLoadBalancerListener", parameters);
    }

}
