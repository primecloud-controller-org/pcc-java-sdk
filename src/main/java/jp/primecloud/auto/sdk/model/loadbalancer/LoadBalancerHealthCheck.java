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

public class LoadBalancerHealthCheck {

    @JsonProperty("CheckProtocol")
    private String checkProtocol;

    @JsonProperty("CheckPort")
    private Integer checkPort;

    @JsonProperty("CheckPath")
    private String checkPath;

    @JsonProperty("CheckTimeout")
    private Integer checkTimeout;

    @JsonProperty("CheckInterval")
    private Integer checkInterval;

    @JsonProperty("HealthyThreshold")
    private Integer healthyThreshold;

    @JsonProperty("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    public String getCheckProtocol() {
        return checkProtocol;
    }

    public void setCheckProtocol(String checkProtocol) {
        this.checkProtocol = checkProtocol;
    }

    public Integer getCheckPort() {
        return checkPort;
    }

    public void setCheckPort(Integer checkPort) {
        this.checkPort = checkPort;
    }

    public String getCheckPath() {
        return checkPath;
    }

    public void setCheckPath(String checkPath) {
        this.checkPath = checkPath;
    }

    public Integer getCheckTimeout() {
        return checkTimeout;
    }

    public void setCheckTimeout(Integer checkTimeout) {
        this.checkTimeout = checkTimeout;
    }

    public Integer getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(Integer checkInterval) {
        this.checkInterval = checkInterval;
    }

    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

}
