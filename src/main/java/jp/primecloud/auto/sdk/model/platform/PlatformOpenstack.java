package jp.primecloud.auto.sdk.model.platform;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlatformOpenstack {

    @JsonProperty("URL")
    private String url;

    @JsonProperty("NetworkID")
    private String networkId;

    @JsonProperty("TenantID")
    private String tenantId;

    @JsonProperty("TenantNm")
    private String tenantNm;

    @JsonProperty("AvailavilityZone")
    private String availabilityZone;

    @JsonProperty("DefKeyPair")
    private String defKeyPair;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantNm() {
        return tenantNm;
    }

    public void setTenantNm(String tenantNm) {
        this.tenantNm = tenantNm;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getDefKeyPair() {
        return defKeyPair;
    }

    public void setDefKeyPair(String defKeyPair) {
        this.defKeyPair = defKeyPair;
    }

}
