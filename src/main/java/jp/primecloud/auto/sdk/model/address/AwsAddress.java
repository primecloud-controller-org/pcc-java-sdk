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
package jp.primecloud.auto.sdk.model.address;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AwsAddress {

    @JsonProperty("AddressNo")
    private Long addressNo;

    @JsonProperty("PlatformNo")
    private Long platformNo;

    @JsonProperty("PublicIp")
    private String publicIp;

    @JsonProperty("Comment")
    private String comment;

    @JsonProperty("AssociateInstanceno")
    private Long associateInstanceNo;

    public Long getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(Long addressNo) {
        this.addressNo = addressNo;
    }

    public Long getPlatformNo() {
        return platformNo;
    }

    public void setPlatformNo(Long platformNo) {
        this.platformNo = platformNo;
    }

    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getAssociateInstanceNo() {
        return associateInstanceNo;
    }

    public void setAssociateInstanceNo(Long associateInstanceNo) {
        this.associateInstanceNo = associateInstanceNo;
    }

}
