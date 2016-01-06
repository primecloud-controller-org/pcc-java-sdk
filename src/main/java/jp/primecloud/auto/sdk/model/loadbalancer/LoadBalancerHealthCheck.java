package jp.primecloud.auto.sdk.model.loadbalancer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoadBalancerHealthCheck {

    @JsonProperty("CheckProtocol")
    private String checkProtocol;

    @JsonProperty("CheckPort")
    private Integer checkPort;

    @JsonProperty("CheckPath")
    private String checkPath;

    @JsonProperty("CheckTimeout")
    private Integer checkTimeout;

    @JsonProperty("CheckInterval")
    private Integer checkInterval;

    @JsonProperty("HealthyThreshold")
    private Integer healthyThreshold;

    @JsonProperty("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    public String getCheckProtocol() {
        return checkProtocol;
    }

    public void setCheckProtocol(String checkProtocol) {
        this.checkProtocol = checkProtocol;
    }

    public Integer getCheckPort() {
        return checkPort;
    }

    public void setCheckPort(Integer checkPort) {
        this.checkPort = checkPort;
    }

    public String getCheckPath() {
        return checkPath;
    }

    public void setCheckPath(String checkPath) {
        this.checkPath = checkPath;
    }

    public Integer getCheckTimeout() {
        return checkTimeout;
    }

    public void setCheckTimeout(Integer checkTimeout) {
        this.checkTimeout = checkTimeout;
    }

    public Integer getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(Integer checkInterval) {
        this.checkInterval = checkInterval;
    }

    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

}
