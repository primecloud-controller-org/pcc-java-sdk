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

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlatformOpenstack {

    @JsonProperty("URL")
    private String url;

    @JsonProperty("NetworkID")
    private String networkId;

    @JsonProperty("TenantID")
    private String tenantId;

    @JsonProperty("TenantNm")
    private String tenantNm;

    @JsonProperty("AvailavilityZone")
    private String availabilityZone;

    @JsonProperty("DefKeyPair")
    private String defKeyPair;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantNm() {
        return tenantNm;
    }

    public void setTenantNm(String tenantNm) {
        this.tenantNm = tenantNm;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getDefKeyPair() {
        return defKeyPair;
    }

    public void setDefKeyPair(String defKeyPair) {
        this.defKeyPair = defKeyPair;
    }

}
