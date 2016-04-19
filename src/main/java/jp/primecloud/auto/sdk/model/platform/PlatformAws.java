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
package jp.primecloud.auto.sdk.model.platform;

import java.util.ArrayList;
import java.util.List;

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

    @JsonProperty("KeyNames")
    private List<String> keyNames = new ArrayList<String>();

    @JsonProperty("SecurityGroups")
    private List<String> securityGroups = new ArrayList<String>();

    @JsonProperty("Subnets")
    private List<String> subnets = new ArrayList<String>();

    @JsonProperty("DefKeyPair")
    private String defKeyPair;

    @JsonProperty("DefSubnet")
    private String defSubnet;

    @JsonProperty("DefLbSubnet")
    private String defLbSubnet;

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

    public List<String> getKeyNames() {
        return keyNames;
    }

    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }

    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public List<String> getSubnets() {
        return subnets;
    }

    public void setSubnets(List<String> subnets) {
        this.subnets = subnets;
    }

    public String getDefKeyPair() {
        return defKeyPair;
    }

    public void setDefKeyPair(String defKeyPair) {
        this.defKeyPair = defKeyPair;
    }

    public String getDefSubnet() {
        return defSubnet;
    }

    public void setDefSubnet(String defSubnet) {
        this.defSubnet = defSubnet;
    }

    public String getDefLbSubnet() {
        return defLbSubnet;
    }

    public void setDefLbSubnet(String defLbSubnet) {
        this.defLbSubnet = defLbSubnet;
    }

}
