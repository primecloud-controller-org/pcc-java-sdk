package jp.primecloud.auto.sdk.model.component;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComponentInstance {

    @JsonProperty("InstanceNo")
    private Long instanceNo;

    @JsonProperty("Associate")
    private Boolean associate;

    @JsonProperty("Status")
    private String status;

    public Long getInstanceNo() {
        return instanceNo;
    }

    public void setInstanceNo(Long instanceNo) {
        this.instanceNo = instanceNo;
    }

    public Boolean getAssociate() {
        return associate;
    }

    public void setAssociate(Boolean associate) {
        this.associate = associate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
