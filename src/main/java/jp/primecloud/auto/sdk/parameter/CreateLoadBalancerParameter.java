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

public class CreateLoadBalancerParameter {

    private Long farmNo;

    private String loadBalancerName;

    private String loadBalancerType;

    private Long platformNo;

    private Long componentNo;

    private String comment;

    private Boolean isInternal;

    public CreateLoadBalancerParameter(Long farmNo, String loadBalancerName, String loadBalancerType, Long platformNo,
            Long componentNo) {
        this.farmNo = farmNo;
        this.loadBalancerName = loadBalancerName;
        this.loadBalancerType = loadBalancerType;
        this.platformNo = platformNo;
        this.componentNo = componentNo;
    }

    public CreateLoadBalancerParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public CreateLoadBalancerParameter withIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
        return this;
    }

    public Long getFarmNo() {
        return farmNo;
    }

    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    public String getLoadBalancerType() {
        return loadBalancerType;
    }

    public Long getPlatformNo() {
        return platformNo;
    }

    public Long getComponentNo() {
        return componentNo;
    }

    public String getComment() {
        return comment;
    }

    public Boolean getIsInternal() {
        return isInternal;
    }

}
