package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.EditLoadBalancerParameter;

public class EditLoadBalancer {

    protected Requester requester;

    public EditLoadBalancer(Requester requester) {
        this.requester = requester;
    }

    public void execute(EditLoadBalancerParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("LoadBalancerNo", parameter.getLoadBalancerNo().toString());
        parameters.put("ComponentNo", parameter.getComponentNo().toString());
        parameters.put("SecurityGroups", parameter.getSecurityGroups());

        if (parameter.getComment() != null) {
            parameters.put("Comment", parameter.getComment());
        }

        if (parameter.getSubnet() != null) {
            parameters.put("Subnet", parameter.getSubnet());
        }

        if (parameter.getIsInternal() != null) {
            parameters.put("IsInternal", parameter.getIsInternal().toString());
        }

        requester.execute("/EditLoadBalancer", parameters);
    }

}
