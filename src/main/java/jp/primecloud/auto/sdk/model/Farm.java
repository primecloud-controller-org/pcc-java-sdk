package jp.primecloud.auto.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Farm {

    @JsonProperty("FarmNo")
    private Long farmNo;

    @JsonProperty("FarmName")
    private String farmName;

    @JsonProperty("DomainName")
    private String domainName;

    @JsonProperty("Comment")
    private String comment;

    public Long getFarmNo() {
        return farmNo;
    }

    public void setFarmNo(Long farmNo) {
        this.farmNo = farmNo;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
