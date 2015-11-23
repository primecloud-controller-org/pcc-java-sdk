package jp.primecloud.auto.sdk.model.instance;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstanceVcloud {

    @JsonProperty("VmName")
    private String vmName;

    @JsonProperty("StorageTypeName")
    private String storageTypeName;

    @JsonProperty("InstanceType")
    private String instanceType;

    @JsonProperty("KeyName")
    private String keyName;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("IpAddress")
    private String ipAddress;

    @JsonProperty("PrivateIpAddress")
    private String privateIpAddress;

    @JsonProperty("VcloudNetworks")
    private List<InstanceVcloudNetwork> vcloudNetwoks;

    public String getVmName() {
        return vmName;
    }

    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    public String getStorageTypeName() {
        return storageTypeName;
    }

    public void setStorageTypeName(String storageTypeName) {
        this.storageTypeName = storageTypeName;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public List<InstanceVcloudNetwork> getVcloudNetwoks() {
        return vcloudNetwoks;
    }

    public void setVcloudNetwoks(List<InstanceVcloudNetwork> vcloudNetwoks) {
        this.vcloudNetwoks = vcloudNetwoks;
    }

}
