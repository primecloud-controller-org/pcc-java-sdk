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
package jp.primecloud.auto.sdk.model.instance;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstanceVcloudNetwork {

    @JsonProperty("NetworkName")
    private String networkName;

    @JsonProperty("NetworkIndex")
    private String networkIndex;

    @JsonProperty("IpMode")
    private String ipMode;

    @JsonProperty("IpAddress")
    private String ipAddress;

    @JsonProperty("IsPrimary")
    private Boolean isPrimary;

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getNetworkIndex() {
        return networkIndex;
    }

    public void setNetworkIndex(String networkIndex) {
        this.networkIndex = networkIndex;
    }

    public String getIpMode() {
        return ipMode;
    }

    public void setIpMode(String ipMode) {
        this.ipMode = ipMode;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

}
