package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.loadbalancer.LoadBalancer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class ListLoadBalancer {

    protected Requester requester;

    public ListLoadBalancer(Requester requester) {
        this.requester = requester;
    }

    public List<LoadBalancer> execute(Long farmNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());

        JsonNode jsonNode = requester.execute("/ListLoadBalancer", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "LoadBalancers");

        if (jsonNode == null) {
            return new ArrayList<LoadBalancer>();
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<LoadBalancer>>() {
        });
    }

}
