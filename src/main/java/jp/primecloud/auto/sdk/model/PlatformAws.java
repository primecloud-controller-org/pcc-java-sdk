package jp.primecloud.auto.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlatformAws {

    @JsonProperty("Host")
    private String host;

    @JsonProperty("Port")
    private Integer port;

    @JsonProperty("Secure")
    private Boolean secure;

    @JsonProperty("Euca")
    private Boolean euca;

    @JsonProperty("Vpc")
    private Boolean vpc;

    @JsonProperty("Region")
    private String region;

    @JsonProperty("AvailabilityZone")
    private String availabilityZone;

    @JsonProperty("VpcId")
    private String vpcId;

    @JsonProperty("DefKeyPair")
    private String defKeyPair;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Boolean getSecure() {
        return secure;
    }

    public void setSecure(Boolean secure) {
        this.secure = secure;
    }

    public Boolean getEuca() {
        return euca;
    }

    public void setEuca(Boolean euca) {
        this.euca = euca;
    }

    public Boolean getVpc() {
        return vpc;
    }

    public void setVpc(Boolean vpc) {
        this.vpc = vpc;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getDefKeyPair() {
        return defKeyPair;
    }

    public void setDefKeyPair(String defKeyPair) {
        this.defKeyPair = defKeyPair;
    }

}
