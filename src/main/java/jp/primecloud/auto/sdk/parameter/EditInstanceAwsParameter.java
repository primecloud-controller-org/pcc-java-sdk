package jp.primecloud.auto.sdk.parameter;

public class EditInstanceAwsParameter {

    private Long farmNo;

    private Long instanceNo;

    private String instanceType;

    private String keyName;

    private String securityGroups;

    private String subnet;

    private String availabilityZone;

    private String ipAddress;

    private String privateIpAddress;

    private String comment;

    public EditInstanceAwsParameter(Long farmNo, Long instanceNo, String instanceType, String keyName,
            String securityGroups, String subnet) {
        this.farmNo = farmNo;
        this.instanceNo = instanceNo;
        this.instanceType = instanceType;
        this.keyName = keyName;
        this.securityGroups = securityGroups;
        this.subnet = subnet;
    }

    public EditInstanceAwsParameter withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public EditInstanceAwsParameter withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public EditInstanceAwsParameter withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public EditInstanceAwsParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Long getFarmNo() {
        return farmNo;
    }

    public Long getInstanceNo() {
        return instanceNo;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public String getKeyName() {
        return keyName;
    }

    public String getSecurityGroups() {
        return securityGroups;
    }

    public String getSubnet() {
        return subnet;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public String getComment() {
        return comment;
    }

}
