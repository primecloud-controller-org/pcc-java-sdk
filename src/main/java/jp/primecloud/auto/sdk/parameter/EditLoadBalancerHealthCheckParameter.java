package jp.primecloud.auto.sdk.parameter;

public class EditLoadBalancerHealthCheckParameter {

    private Long loadBalancerNo;

    private String checkProtocol;

    private Integer checkPort;

    private String checkPath;

    private Integer checkTimeout;

    private Integer checkInterval;

    private Integer healthyThreshold;

    private Integer unhealthyThreshold;

    public EditLoadBalancerHealthCheckParameter(Long loadBalancerNo, String checkProtocol, Integer checkPort,
            String checkPath, Integer checkTimeout, Integer checkInterval, Integer healthyThreshold,
            Integer unhealthyThreshold) {
        this.loadBalancerNo = loadBalancerNo;
        this.checkProtocol = checkProtocol;
        this.checkPort = checkPort;
        this.checkPath = checkPath;
        this.checkTimeout = checkTimeout;
        this.checkInterval = checkInterval;
        this.healthyThreshold = healthyThreshold;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    public Long getLoadBalancerNo() {
        return loadBalancerNo;
    }

    public String getCheckProtocol() {
        return checkProtocol;
    }

    public Integer getCheckPort() {
        return checkPort;
    }

    public String getCheckPath() {
        return checkPath;
    }

    public Integer getCheckTimeout() {
        return checkTimeout;
    }

    public Integer getCheckInterval() {
        return checkInterval;
    }

    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

}
