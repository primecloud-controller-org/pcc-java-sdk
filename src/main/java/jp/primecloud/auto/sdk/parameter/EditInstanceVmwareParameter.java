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

public class EditInstanceVmwareParameter {

    private Long instanceNo;

    private String instanceType;

    private String keyName;

    private String computeResource;

    private Boolean isStaticIp;

    private String ipAddress;

    private String subnetMask;

    private String defaultGateway;

    private String comment;

    public EditInstanceVmwareParameter(Long instanceNo, String instanceType, String keyName, String computeResource,
            Boolean isStaticIp) {
        this.instanceNo = instanceNo;
        this.instanceType = instanceType;
        this.keyName = keyName;
        this.computeResource = computeResource;
        this.isStaticIp = isStaticIp;
    }

    public EditInstanceVmwareParameter withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public EditInstanceVmwareParameter withSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
        return this;
    }

    public EditInstanceVmwareParameter withDefaultGateway(String defaultGateway) {
        this.defaultGateway = defaultGateway;
        return this;
    }

    public EditInstanceVmwareParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Long getInstanceNo() {
        return instanceNo;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public String getKeyName() {
        return keyName;
    }

    public String getComputeResource() {
        return computeResource;
    }

    public Boolean getIsStaticIp() {
        return isStaticIp;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public String getDefaultGateway() {
        return defaultGateway;
    }

    public String getComment() {
        return comment;
    }

}
