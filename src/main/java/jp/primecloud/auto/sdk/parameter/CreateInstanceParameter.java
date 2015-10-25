package jp.primecloud.auto.sdk.parameter;

public class CreateInstanceParameter {

    private Long farmNo;

    private String instanceName;

    private Long platformNo;

    private Long imageNo;

    private String comment;

    private String instanceType;

    public CreateInstanceParameter(Long farmNo, String instanceName, Long platformNo, Long imageNo) {
        this.farmNo = farmNo;
        this.instanceName = instanceName;
        this.platformNo = platformNo;
        this.imageNo = imageNo;
    }

    public CreateInstanceParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public CreateInstanceParameter withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public Long getFarmNo() {
        return farmNo;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public Long getPlatformNo() {
        return platformNo;
    }

    public Long getImageNo() {
        return imageNo;
    }

    public String getComment() {
        return comment;
    }

    public String getInstanceType() {
        return instanceType;
    }

}
