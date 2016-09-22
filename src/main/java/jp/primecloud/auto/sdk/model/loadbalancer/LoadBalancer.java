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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoadBalancer {

    @JsonProperty("LoadBalancerNo")
    private Long loadBalancerNo;

    @JsonProperty("LoadBalancerName")
    private String loadBalancerName;

    @JsonProperty("FarmNo")
    private Long farmNo;

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("FQDN")
    private String fqdn;

    @JsonProperty("PlatformNo")
    private Long platformNo;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("ComponentNo")
    private Long componentNo;

    @JsonProperty("ComponentName")
    private String componentName;

    @JsonProperty("Listeners")
    private List<LoadBalancerListener> listeners;

    @JsonProperty("HealthCheck")
    private LoadBalancerHealthCheck healthCheck;

    @JsonProperty("Instances")
    private List<LoadBalancerInstance> instances;

    @JsonProperty("AutoScaling")
    private AutoScaling autoScaling;

    @JsonProperty("AWS")
    private LoadBalancerAws aws;

    public Long getLoadBalancerNo() {
        return loadBalancerNo;
    }

    public void setLoadBalancerNo(Long loadBalancerNo) {
        this.loadBalancerNo = loadBalancerNo;
    }

    public String getLoadBalancerName() {
        return loadBalancerName;
    }

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    public Long getFarmNo() {
        return farmNo;
    }

    public void setFarmNo(Long farmNo) {
        this.farmNo = farmNo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    public Long getPlatformNo() {
        return platformNo;
    }

    public void setPlatformNo(Long platformNo) {
        this.platformNo = platformNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getComponentNo() {
        return componentNo;
    }

    public void setComponentNo(Long componentNo) {
        this.componentNo = componentNo;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public List<LoadBalancerListener> getListeners() {
        return listeners;
    }

    public void setListeners(List<LoadBalancerListener> listeners) {
        this.listeners = listeners;
    }

    public LoadBalancerHealthCheck getHealthCheck() {
        return healthCheck;
    }

    public void setHealthCheck(LoadBalancerHealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    public List<LoadBalancerInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<LoadBalancerInstance> instances) {
        this.instances = instances;
    }

    public AutoScaling getAutoScaling() {
        return autoScaling;
    }

    public void setAutoScaling(AutoScaling autoScaling) {
        this.autoScaling = autoScaling;
    }

    public LoadBalancerAws getAws() {
        return aws;
    }

    public void setAws(LoadBalancerAws aws) {
        this.aws = aws;
    }

}
