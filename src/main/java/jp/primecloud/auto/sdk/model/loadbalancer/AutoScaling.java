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

public class AutoScaling {

    @JsonProperty("Enabled")
    private Boolean enabled;

    @JsonProperty("PlatformNo")
    private Long platformNo;

    @JsonProperty("ImageNo")
    private Long imageNo;

    @JsonProperty("InstanceType")
    private String instanceType;

    @JsonProperty("NamingRule")
    private String namingRule;

    @JsonProperty("IdleTimeMax")
    private Integer idleTimeMax;

    @JsonProperty("IdleTimeMin")
    private Integer idleTimeMin;

    @JsonProperty("ContinueLimit")
    private Integer continueLimit;

    @JsonProperty("AddCount")
    private Integer addCount;

    @JsonProperty("DelCount")
    private Integer delCount;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Long getPlatformNo() {
        return platformNo;
    }

    public void setPlatformNo(Long platformNo) {
        this.platformNo = platformNo;
    }

    public Long getImageNo() {
        return imageNo;
    }

    public void setImageNo(Long imageNo) {
        this.imageNo = imageNo;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getNamingRule() {
        return namingRule;
    }

    public void setNamingRule(String namingRule) {
        this.namingRule = namingRule;
    }

    public Integer getIdleTimeMax() {
        return idleTimeMax;
    }

    public void setIdleTimeMax(Integer idleTimeMax) {
        this.idleTimeMax = idleTimeMax;
    }

    public Integer getIdleTimeMin() {
        return idleTimeMin;
    }

    public void setIdleTimeMin(Integer idleTimeMin) {
        this.idleTimeMin = idleTimeMin;
    }

    public Integer getContinueLimit() {
        return continueLimit;
    }

    public void setContinueLimit(Integer continueLimit) {
        this.continueLimit = continueLimit;
    }

    public Integer getAddCount() {
        return addCount;
    }

    public void setAddCount(Integer addCount) {
        this.addCount = addCount;
    }

    public Integer getDelCount() {
        return delCount;
    }

    public void setDelCount(Integer delCount) {
        this.delCount = delCount;
    }

}
