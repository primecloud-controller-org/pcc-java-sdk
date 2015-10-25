package jp.primecloud.auto.sdk.parameter;

public class CreateLoadBalancerParameter {

    private Long farmNo;

    private String loadBalancerName;

    private String loadBalancerType;

    private Long platformNo;

    private Long componentNo;

    private String comment;

    private Boolean isInternal;

    public CreateLoadBalancerParameter(Long farmNo, String loadBalancerName, String loadBalancerType, Long platformNo,
            Long componentNo) {
        this.farmNo = farmNo;
        this.loadBalancerName = loadBalancerName;
        this.loadBalancerType = loadBalancerType;
        this.platformNo = platformNo;
        this.componentNo = componentNo;
    }

    public CreateLoadBalancerParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public CreateLoadBalancerParameter withIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
        return this;
    }

    public Long getFarmNo() {
        return farmNo;
    }

    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    public String getLoadBalancerType() {
        return loadBalancerType;
    }

    public Long getPlatformNo() {
        return platformNo;
    }

    public Long getComponentNo() {
        return componentNo;
    }

    public String getComment() {
        return comment;
    }

    public Boolean getIsInternal() {
        return isInternal;
    }

}
