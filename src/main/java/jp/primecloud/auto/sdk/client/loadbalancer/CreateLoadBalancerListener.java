package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.CreateLoadBalancerListenerParameter;

public class CreateLoadBalancerListener {

    protected Requester requester;

    public CreateLoadBalancerListener(Requester requester) {
        this.requester = requester;
    }

    public void execute(CreateLoadBalancerListenerParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", parameter.getFarmNo().toString());
        parameters.put("LoadBalancerNo", parameter.getLoadBalancerNo().toString());
        parameters.put("LoadBalancerPort", parameter.getLoadBalancerPort().toString());
        parameters.put("ServicePort", parameter.getServicePort().toString());
        parameters.put("Protocol", parameter.getProtocol());

        if (parameter.getSslKeyNo() != null) {
            parameters.put("SslKeyNo", parameter.getSslKeyNo().toString());
        }

        requester.execute("/CreateLoadBalancerListener", parameters);
    }

}
