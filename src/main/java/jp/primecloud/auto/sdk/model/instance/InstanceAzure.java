package jp.primecloud.auto.sdk.model.instance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstanceAzure {

    @JsonProperty("InstanceName")
    private String instanceName;

    @JsonProperty("AffinityGruopName")
    private String affinityGroupName;

    @JsonProperty("CloudServiceName")
    private String cloudServiceName;

    @JsonProperty("StorageAccountName")
    private String storageAccountName;

    @JsonProperty("NetworkName")
    private String networkName;

    @JsonProperty("InstanceType")
    private String instanceType;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("SubnetId")
    private String subnetId;

    @JsonProperty("PrivateIpAddress")
    private String privateIpAddress;

    @JsonProperty("LocationName")
    private String locationName;

    @JsonProperty("AvailabilitySet")
    private String availabilitySet;

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getAffinityGroupName() {
        return affinityGroupName;
    }

    public void setAffinityGroupName(String affinityGroupName) {
        this.affinityGroupName = affinityGroupName;
    }

    public String getCloudServiceName() {
        return cloudServiceName;
    }

    public void setCloudServiceName(String cloudServiceName) {
        this.cloudServiceName = cloudServiceName;
    }

    public String getStorageAccountName() {
        return storageAccountName;
    }

    public void setStorageAccountName(String storageAccountName) {
        this.storageAccountName = storageAccountName;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
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

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAvailabilitySet() {
        return availabilitySet;
    }

    public void setAvailabilitySet(String availabilitySet) {
        this.availabilitySet = availabilitySet;
    }

}
