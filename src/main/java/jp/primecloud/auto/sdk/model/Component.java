package jp.primecloud.auto.sdk.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Component {

    @JsonProperty("ComponentNo")
    private Long componentNo;

    @JsonProperty("ComponentName")
    private String componentName;

    @JsonProperty("ComponentTypeNo")
    private Long componentTypeNo;

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("InstanceCount")
    private Integer instanceCount;

    @JsonProperty("Instances")
    private List<ComponentInstance> instances;

    @JsonProperty("LoadBalancerName")
    private String loadBalancerName;

    @JsonProperty("Status")
    private String status;

    public Long getComponentNo() {
        return componentNo;
    }

    public void setComponentNo(Long componentNo) {
        this.componentNo = componentNo;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public Long getComponentTypeNo() {
        return componentTypeNo;
    }

    public void setComponentTypeNo(Long componentTypeNo) {
        this.componentTypeNo = componentTypeNo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public List<ComponentInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<ComponentInstance> instances) {
        this.instances = instances;
    }

    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
