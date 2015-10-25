package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class DetachLoadBalancer {

    protected Requester requester;

    public DetachLoadBalancer(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long farmNo, Long loadBalancerNo, Long instanceNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());
        parameters.put("LoadBalancerNo", loadBalancerNo.toString());
        parameters.put("InstanceNo", instanceNo.toString());

        requester.execute("/DetachLoadBalancer", parameters);
    }

}
