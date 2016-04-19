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

public class EditLoadBalancerParameter {

    private Long loadBalancerNo;

    private Long componentNo;

    private String securityGroups;

    private String comment;

    private String subnet;

    private Boolean isInternal;

    public EditLoadBalancerParameter(Long loadBalancerNo, Long componentNo, String securityGroups) {
        this.loadBalancerNo = loadBalancerNo;
        this.componentNo = componentNo;
        this.securityGroups = securityGroups;
    }

    public EditLoadBalancerParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public EditLoadBalancerParameter withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    public EditLoadBalancerParameter withIsInternal(Boolean isInternal) {
        this.isInternal = isInternal;
        return this;
    }

    public Long getLoadBalancerNo() {
        return loadBalancerNo;
    }

    public Long getComponentNo() {
        return componentNo;
    }

    public String getSecurityGroups() {
        return securityGroups;
    }

    public String getComment() {
        return comment;
    }

    public String getSubnet() {
        return subnet;
    }

    public Boolean getIsInternal() {
        return isInternal;
    }

}
