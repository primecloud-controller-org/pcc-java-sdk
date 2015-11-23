package jp.primecloud.auto.sdk.model.instance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstanceVcloudNetwork {

    @JsonProperty("NetworkName")
    private String networkName;

    @JsonProperty("NetworkIndex")
    private String networkIndex;

    @JsonProperty("IpMode")
    private String ipMode;

    @JsonProperty("IpAddress")
    private String ipAddress;

    @JsonProperty("IsPrimary")
    private Boolean isPrimary;

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getNetworkIndex() {
        return networkIndex;
    }

    public void setNetworkIndex(String networkIndex) {
        this.networkIndex = networkIndex;
    }

    public String getIpMode() {
        return ipMode;
    }

    public void setIpMode(String ipMode) {
        this.ipMode = ipMode;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

}
