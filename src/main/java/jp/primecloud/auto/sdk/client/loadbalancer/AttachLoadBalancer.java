package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

public class AttachLoadBalancer {

    protected Requester requester;

    public AttachLoadBalancer(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long loadBalancerNo, Long instanceNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("LoadBalancerNo", loadBalancerNo.toString());
        parameters.put("InstanceNo", instanceNo.toString());

        requester.execute("/AttachLoadBalancer", parameters);
    }

}
