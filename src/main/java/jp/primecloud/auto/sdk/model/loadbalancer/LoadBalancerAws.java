/*
 * Copyright 2016 SCSK Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
