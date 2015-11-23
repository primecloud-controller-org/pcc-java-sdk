package jp.primecloud.auto.sdk.model.instance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstanceNifty {

    @JsonProperty("KeyName")
    private String keyName;

    @JsonProperty("InstanceType")
    private String instanceType;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("DnsName")
    private String dnsName;

    @JsonProperty("PrivateDnsName")
    private String privateDnsName;

    @JsonProperty("IpAddress")
    private String ipAddress;

    @JsonProperty("PrivateIpAddress")
    private String privateIpAddress;

    @JsonProperty("Initialized")
    private Boolean initialized;

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    public String getPrivateDnsName() {
        return privateDnsName;
    }

    public void setPrivateDnsName(String privateDnsName) {
        this.privateDnsName = privateDnsName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public Boolean getInitialized() {
        return initialized;
    }

    public void setInitialized(Boolean initialized) {
        this.initialized = initialized;
    }

}
