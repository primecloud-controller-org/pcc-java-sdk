package jp.primecloud.auto.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoadBalancerInstance {

    @JsonProperty("InstanceNo")
    private Long instanceNo;

    @JsonProperty("Enabled")
    private Boolean enabled;

    @JsonProperty("Status")
    private String status;

    public Long getInstanceNo() {
        return instanceNo;
    }

    public void setInstanceNo(Long instanceNo) {
        this.instanceNo = instanceNo;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
