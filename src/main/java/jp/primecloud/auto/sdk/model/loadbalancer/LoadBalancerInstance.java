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
