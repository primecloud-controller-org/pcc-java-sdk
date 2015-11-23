package jp.primecloud.auto.sdk.model.instance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Instance {

    @JsonProperty("InstanceNo")
    private Long instanceNo;

    @JsonProperty("InstanceName")
    private String instanceName;

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("Fqdn")
    private String fqdn;

    @JsonProperty("PublicIp")
    private String publicIp;

    @JsonProperty("PrivateIp")
    private String privateIp;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("Aws")
    private InstanceAws aws;

    @JsonProperty("Nifty")
    private InstanceNifty nifty;

    @JsonProperty("Vmware")
    private InstanceVmware vmware;

    @JsonProperty("Cloudstack")
    private InstanceCloudstack cloudstack;

    @JsonProperty("Vcloud")
    private InstanceVcloud vcloud;

    @JsonProperty("Openstack")
    private InstanceOpenstack openstack;

    @JsonProperty("Azure")
    private InstanceAzure azure;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public InstanceNifty getNifty() {
        return nifty;
    }

    public void setNifty(InstanceNifty nifty) {
        this.nifty = nifty;
    }

    public InstanceVmware getVmware() {
        return vmware;
    }

    public void setVmware(InstanceVmware vmware) {
        this.vmware = vmware;
    }

    public InstanceCloudstack getCloudstack() {
        return cloudstack;
    }

    public void setCloudstack(InstanceCloudstack cloudstack) {
        this.cloudstack = cloudstack;
    }

    public InstanceVcloud getVcloud() {
        return vcloud;
    }

    public void setVcloud(InstanceVcloud vcloud) {
        this.vcloud = vcloud;
    }

    public InstanceOpenstack getOpenstack() {
        return openstack;
    }

    public void setOpenstack(InstanceOpenstack openstack) {
        this.openstack = openstack;
    }

    public InstanceAzure getAzure() {
        return azure;
    }

    public void setAzure(InstanceAzure azure) {
        this.azure = azure;
    }

}
