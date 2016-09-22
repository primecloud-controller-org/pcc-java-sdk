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
package jp.primecloud.auto.sdk.model.component;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Component {

    @JsonProperty("ComponentNo")
    private Long componentNo;

    @JsonProperty("ComponentName")
    private String componentName;

    @JsonProperty("FarmNo")
    private Long farmNo;

    @JsonProperty("ComponentTypeNo")
    private Long componentTypeNo;

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("InstanceCount")
    private Integer instanceCount;

    @JsonProperty("Instances")
    private List<ComponentInstance> instances;

    @JsonProperty("LoadBalancers")
    private List<ComponentLoadBalancer> loadBalancers;

    @JsonProperty("Status")
    private String status;

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

    public Long getFarmNo() {
        return farmNo;
    }

    public void setFarmNo(Long farmNo) {
        this.farmNo = farmNo;
    }

    public Long getComponentTypeNo() {
        return componentTypeNo;
    }

    public void setComponentTypeNo(Long componentTypeNo) {
        this.componentTypeNo = componentTypeNo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public List<ComponentInstance> getInstances() {
        return instances;
    }

    public void setInstances(List<ComponentInstance> instances) {
        this.instances = instances;
    }

    public List<ComponentLoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

    public void setLoadBalancers(List<ComponentLoadBalancer> loadBalancers) {
        this.loadBalancers = loadBalancers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
