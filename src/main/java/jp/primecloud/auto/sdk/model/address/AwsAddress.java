package jp.primecloud.auto.sdk.model.address;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AwsAddress {

    @JsonProperty("AddressNo")
    private Long addressNo;

    @JsonProperty("PlatformNo")
    private Long platformNo;

    @JsonProperty("PublicIp")
    private String publicIp;

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("AssociateInstanceno")
    private Long associateInstanceNo;

    public Long getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(Long addressNo) {
        this.addressNo = addressNo;
    }

    public Long getPlatformNo() {
        return platformNo;
    }

    public void setPlatformNo(Long platformNo) {
        this.platformNo = platformNo;
    }

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getAssociateInstanceNo() {
        return associateInstanceNo;
    }

    public void setAssociateInstanceNo(Long associateInstanceNo) {
        this.associateInstanceNo = associateInstanceNo;
    }

}
