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

public class EditComponentParameter {

    private Long componentNo;

    private Integer diskSize;

    private String comment;

    private String customParam1;

    private String customParam2;

    private String customParam3;

    public EditComponentParameter(Long componentNo, Integer diskSize) {
        this.componentNo = componentNo;
        this.diskSize = diskSize;
    }

    public EditComponentParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public EditComponentParameter withCustomParam1(String customParam1) {
        this.customParam1 = customParam1;
        return this;
    }

    public EditComponentParameter withCustomParam2(String customParam2) {
        this.customParam2 = customParam3;
        return this;
    }

    public EditComponentParameter withCustomParam3(String customParam3) {
        this.customParam3 = customParam3;
        return this;
    }

    public Long getComponentNo() {
        return componentNo;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public String getComment() {
        return comment;
    }

    public String getCustomParam1() {
        return customParam1;
    }

    public String getCustomParam2() {
        return customParam2;
    }

    public String getCustomParam3() {
        return customParam3;
    }

}
