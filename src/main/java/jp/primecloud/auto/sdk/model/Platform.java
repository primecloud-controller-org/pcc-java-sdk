package jp.primecloud.auto.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Platform {

    @JsonProperty("PlatformNo")
    private Long platformNo;

    @JsonProperty("PlatformName")
    private String platformName;

    @JsonProperty("Internal")
    private Boolean internal;

    @JsonProperty("PlatformType")
    private String platformType;

    @JsonProperty("AWS")
    private PlatformAws aws;

    public Long getPlatformNo() {
        return platformNo;
    }

    public void setPlatformNo(Long platformNo) {
        this.platformNo = platformNo;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType;
    }

    public PlatformAws getAws() {
        return aws;
    }

    public void setAws(PlatformAws aws) {
        this.aws = aws;
    }

}
