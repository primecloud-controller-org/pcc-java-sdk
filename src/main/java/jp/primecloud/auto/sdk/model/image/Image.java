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
package jp.primecloud.auto.sdk.model.image;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {

    @JsonProperty("ImageNo")
    private Long imageNo;

    @JsonProperty("ImageName")
    private String imageName;

    @JsonProperty("PlatformName")
    private String platformName;

    @JsonProperty("OS")
    private String os;

    @JsonProperty("InstanceTypes")
    private List<String> instanceTypes;

    public Long getImageNo() {
        return imageNo;
    }

    public void setImageNo(Long imageNo) {
        this.imageNo = imageNo;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public List<String> getInstanceTypes() {
        return instanceTypes;
    }

    public void setInstanceTypes(List<String> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }

}
