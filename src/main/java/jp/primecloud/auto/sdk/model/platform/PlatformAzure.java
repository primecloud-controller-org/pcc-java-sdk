package jp.primecloud.auto.sdk.model.platform;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlatformAzure {

    @JsonProperty("LocationName")
    private String locationName;

    @JsonProperty("AffinityGroupName")
    private String affinityGroupName;

    @JsonProperty("CloudServiceName")
    private String cloudServiceName;

    @JsonProperty("StorageAccountName")
    private String storageAccountName;

    @JsonProperty("DefNetworkName")
    private String networkName;

    @JsonProperty("AvailabilitySets")
    private String availabilitySets;

    @JsonProperty("DefKeyPair")
    private String defKeyPair;

    @JsonProperty("DefSubnet")
    private String defSubnet;

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
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

    public String getAvailabilitySets() {
        return availabilitySets;
    }

    public void setAvailabilitySets(String availabilitySets) {
        this.availabilitySets = availabilitySets;
    }

    public String getDefKeyPair() {
        return defKeyPair;
    }

    public void setDefKeyPair(String defKeyPair) {
        this.defKeyPair = defKeyPair;
    }

    public String getDefSubnet() {
        return defSubnet;
    }

    public void setDefSubnet(String defSubnet) {
        this.defSubnet = defSubnet;
    }

}
