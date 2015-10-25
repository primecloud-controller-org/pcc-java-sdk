package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.LoadBalancer;
import jp.primecloud.auto.sdk.model.LoadBalancerInstance;
import jp.primecloud.auto.sdk.model.LoadBalancerListener;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DescribeLoadBalancer {

    protected Requester requester;

    public DescribeLoadBalancer(Requester requester) {
        this.requester = requester;
    }

    public LoadBalancer execute(Long farmNo, Long loadBalancerNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", farmNo.toString());
        parameters.put("LoadBalancerNo", loadBalancerNo.toString());

        JsonNode jsonNode = requester.execute("/DescribeLoadBalancer", parameters);

        JsonNode listenersNode = JacksonUtils.getField(jsonNode, "LISTENERS.LISTENER");
        ((ObjectNode) jsonNode).remove("LISTENERS");

        JsonNode instancesNode = JacksonUtils.getField(jsonNode, "INSTANCES.INSTANCE");
        ((ObjectNode) jsonNode).remove("INSTANCES");

        LoadBalancer loadBalancer = JacksonUtils.toObject(jsonNode, new TypeReference<LoadBalancer>() {
        });

        if (listenersNode == null) {
            loadBalancer.setListeners(new ArrayList<LoadBalancerListener>());
        } else if (listenersNode instanceof ObjectNode) {
            LoadBalancerListener listener = JacksonUtils.toObject(listenersNode,
                    new TypeReference<LoadBalancerListener>() {
                    });
            loadBalancer.setListeners(Arrays.asList(listener));
        } else {
            List<LoadBalancerListener> listeners = JacksonUtils.toObject(listenersNode,
                    new TypeReference<List<LoadBalancerListener>>() {
                    });
            loadBalancer.setListeners(listeners);
        }

        if (instancesNode == null) {
            loadBalancer.setInstances(new ArrayList<LoadBalancerInstance>());
        } else if (instancesNode instanceof ObjectNode) {
            LoadBalancerInstance instance = JacksonUtils.toObject(instancesNode,
                    new TypeReference<LoadBalancerInstance>() {
                    });
            loadBalancer.setInstances(Arrays.asList(instance));
        } else {
            List<LoadBalancerInstance> instances = JacksonUtils.toObject(instancesNode,
                    new TypeReference<List<LoadBalancerInstance>>() {
                    });
            loadBalancer.setInstances(instances);
        }

        return loadBalancer;
    }

}
