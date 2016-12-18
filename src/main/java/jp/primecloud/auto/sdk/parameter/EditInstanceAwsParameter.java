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

public class EditInstanceAwsParameter {

    private Long instanceNo;

    private String instanceType;

    private String keyName;

    private String securityGroups;

    private String subnet;

    private String availabilityZone;

    private String ipAddress;

    private String privateIpAddress;

    private String comment;

    private Integer rootSize;

    public EditInstanceAwsParameter(Long instanceNo, String instanceType, String keyName, String securityGroups,
            String subnet) {
        this.instanceNo = instanceNo;
        this.instanceType = instanceType;
        this.keyName = keyName;
        this.securityGroups = securityGroups;
        this.subnet = subnet;
    }

    public EditInstanceAwsParameter withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    public EditInstanceAwsParameter withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public EditInstanceAwsParameter withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public EditInstanceAwsParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public EditInstanceAwsParameter withRootSize(Integer rootSize) {
        this.rootSize = rootSize;
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

    public String getSecurityGroups() {
        return securityGroups;
    }

    public String getSubnet() {
        return subnet;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public String getComment() {
        return comment;
    }

    public Integer getRootSize() {
        return rootSize;
    }

}
