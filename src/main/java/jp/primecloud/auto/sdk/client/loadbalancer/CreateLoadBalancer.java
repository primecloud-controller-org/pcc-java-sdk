package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.CreateLoadBalancerParameter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class CreateLoadBalancer {

    protected Requester requester;

    public CreateLoadBalancer(Requester requester) {
        this.requester = requester;
    }

    public Long execute(CreateLoadBalancerParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", parameter.getFarmNo().toString());
        parameters.put("LoadBalancerName", parameter.getLoadBalancerName());
        parameters.put("LoadBalancerType", parameter.getLoadBalancerType());
        parameters.put("ComponentNo", parameter.getComponentNo().toString());
        parameters.put("PlatformNo", parameter.getPlatformNo().toString());

        if (parameter.getComment() != null) {
            parameters.put("Comment", parameter.getComment());
        }

        if (parameter.getIsInternal() != null) {
            parameters.put("IsInternal", parameter.getIsInternal().toString());
        }

        JsonNode jsonNode = requester.execute("/CreateLoadBalancer", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "LoadBalancerNo");

        return JacksonUtils.toObject(jsonNode, new TypeReference<Long>() {
        });
    }

}
