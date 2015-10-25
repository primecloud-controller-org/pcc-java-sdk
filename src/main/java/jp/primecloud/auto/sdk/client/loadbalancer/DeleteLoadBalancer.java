package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class DeleteLoadBalancer {

    protected Requester requester;

    public DeleteLoadBalancer(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long farmNo, Long loadBalancerNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());
        parameters.put("LoadBalancerNo", loadBalancerNo.toString());

        requester.execute("/DeleteLoadBalancer", parameters);
    }

}
