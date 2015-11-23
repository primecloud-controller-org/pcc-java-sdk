package jp.primecloud.auto.sdk.model.component;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComponentLoadBalancer {

    @JsonProperty("LoadBalancerNo")
    private Long loadBalancerNo;

    @JsonProperty("LoadBalancerName")
    private String loadBalancerName;

    public Long getLoadBalancerNo() {
        return loadBalancerNo;
    }

    public void setLoadBalancerNo(Long loadBalancerNo) {
        this.loadBalancerNo = loadBalancerNo;
    }

    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

}
