package jp.primecloud.auto.sdk.model.loadbalancer;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoadBalancer {

    @JsonProperty("LoadBalancerNo")
    private Long loadBalancerNo;

    @JsonProperty("LoadBalancerName")
    private String loadBalancerName;

    @JsonProperty("FQDN")
    private String fqdn;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("ComponentNo")
    private Long componentNo;

    @JsonProperty("ComponentName")
    private String componentName;

    @JsonProperty("Listeners")
    private List<LoadBalancerListener> listeners;

    @JsonProperty("HealthCheck")
    private LoadBalancerHealthCheck healthCheck;

    @JsonProperty("Instances")
    private List<LoadBalancerInstance> instances;

    @JsonProperty("AutoScaling")
    private AutoScaling autoScaling;

    @JsonProperty("AWS")
    private LoadBalancerAws aws;

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

    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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

    public List<LoadBalancerListener> getListeners() {
        return listeners;
    }

    public void setListeners(List<LoadBalancerListener> listeners) {
        this.listeners = listeners;
    }

    public LoadBalancerHealthCheck getHealthCheck() {
        return healthCheck;
    }

    public void setHealthCheck(LoadBalancerHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    public List<LoadBalancerInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<LoadBalancerInstance> instances) {
        this.instances = instances;
    }

    public AutoScaling getAutoScaling() {
        return autoScaling;
    }

    public void setAutoScaling(AutoScaling autoScaling) {
        this.autoScaling = autoScaling;
    }

    public LoadBalancerAws getAws() {
        return aws;
    }

    public void setAws(LoadBalancerAws aws) {
        this.aws = aws;
    }

}
