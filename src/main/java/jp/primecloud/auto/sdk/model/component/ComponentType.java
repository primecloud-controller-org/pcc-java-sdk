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

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComponentType {

    @JsonProperty("ComponentTypeNo")
    private Long componentTypeNo;

    @JsonProperty("ComponentTypeName")
    private String componentTypeName;

    @JsonProperty("ComponentTypeNameDisp")
    private String componentTypeNameDisp;

    @JsonProperty("LayerDisp")
    private String layerDisp;

    @JsonProperty("AddressUrl")
    private String addressUrl;

    public Long getComponentTypeNo() {
        return componentTypeNo;
    }

    public void setComponentTypeNo(Long componentTypeNo) {
        this.componentTypeNo = componentTypeNo;
    }

    public String getComponentTypeName() {
        return componentTypeName;
    }

    public void setComponentTypeName(String componentTypeName) {
        this.componentTypeName = componentTypeName;
    }

    public String getComponentTypeNameDisp() {
        return componentTypeNameDisp;
    }

    public void setComponentTypeNameDisp(String componentTypeNameDisp) {
        this.componentTypeNameDisp = componentTypeNameDisp;
    }

    public String getLayerDisp() {
        return layerDisp;
    }

    public void setLayerDisp(String layerDisp) {
        this.layerDisp = layerDisp;
    }

    public String getAddressUrl() {
        return addressUrl;
    }

    public void setAddressUrl(String addressUrl) {
        this.addressUrl = addressUrl;
    }

}
