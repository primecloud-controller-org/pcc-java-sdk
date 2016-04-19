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
package jp.primecloud.auto.sdk.parameter;

public class EditLoadBalancerHealthCheckParameter {

    private Long loadBalancerNo;

    private String checkProtocol;

    private Integer checkPort;

    private String checkPath;

    private Integer checkTimeout;

    private Integer checkInterval;

    private Integer healthyThreshold;

    private Integer unhealthyThreshold;

    public EditLoadBalancerHealthCheckParameter(Long loadBalancerNo, String checkProtocol, Integer checkPort,
            String checkPath, Integer checkTimeout, Integer checkInterval, Integer healthyThreshold,
            Integer unhealthyThreshold) {
        this.loadBalancerNo = loadBalancerNo;
        this.checkProtocol = checkProtocol;
        this.checkPort = checkPort;
        this.checkPath = checkPath;
        this.checkTimeout = checkTimeout;
        this.checkInterval = checkInterval;
        this.healthyThreshold = healthyThreshold;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    public Long getLoadBalancerNo() {
        return loadBalancerNo;
    }

    public String getCheckProtocol() {
        return checkProtocol;
    }

    public Integer getCheckPort() {
        return checkPort;
    }

    public String getCheckPath() {
        return checkPath;
    }

    public Integer getCheckTimeout() {
        return checkTimeout;
    }

    public Integer getCheckInterval() {
        return checkInterval;
    }

    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

}
