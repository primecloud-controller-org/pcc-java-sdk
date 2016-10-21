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
