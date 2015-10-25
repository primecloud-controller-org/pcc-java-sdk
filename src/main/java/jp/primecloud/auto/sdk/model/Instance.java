package jp.primecloud.auto.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Instance {

    @JsonProperty("InstanceNo")
    private Long instanceNo;

    @JsonProperty("InstanceName")
    private String instanceName;

    @JsonProperty("Fqdn")
    private String fqdn;

    @JsonProperty("PublicIp")
    private String publicIp;

    @JsonProperty("PrivateIp")
    private String privateIp;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("AWS")
    private InstanceAws aws;

    public Long getInstanceNo() {
        return instanceNo;
    }

    public void setInstanceNo(Long instanceNo) {
        this.instanceNo = instanceNo;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstanceAws getAws() {
        return aws;
    }

    public void setAws(InstanceAws aws) {
        this.aws = aws;
    }

}
