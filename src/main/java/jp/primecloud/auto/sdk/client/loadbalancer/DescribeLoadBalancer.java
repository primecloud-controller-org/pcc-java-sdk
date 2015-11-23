package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.loadbalancer.LoadBalancer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class DescribeLoadBalancer {

    protected Requester requester;

    public DescribeLoadBalancer(Requester requester) {
        this.requester = requester;
    }

    public LoadBalancer execute(Long loadBalancerNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("LoadBalancerNo", loadBalancerNo.toString());

        JsonNode jsonNode = requester.execute("/DescribeLoadBalancer", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "LoadBalancer");

        return JacksonUtils.toObject(jsonNode, new TypeReference<LoadBalancer>() {
        });
    }

}
