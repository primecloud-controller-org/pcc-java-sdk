package jp.primecloud.auto.sdk.model.loadbalancer;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoadBalancerAws {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("DnsName")
    private String dnsName;

    @JsonProperty("Subnets")
    private String subnets;

    @JsonProperty("SecurityGroups")
    private String securityGroups;

    @JsonProperty("AvailabilityZones")
    private String availabilityZones;

    @JsonProperty("IsInternal")
    private Boolean isInternal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDnsName() {
        return dnsName;
    }

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    public String getSubnets() {
        return subnets;
    }

    public void setSubnets(String subnets) {
        this.subnets = subnets;
    }

    public String getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(String securityGroups) {
        this.securityGroups = securityGroups;
    }

    public String getAvailabilityZones() {
        return availabilityZones;
    }

    public void setAvailabilityZones(String availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public Boolean getIsInternal() {
        return isInternal;
    }

    public void setIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
    }

}
