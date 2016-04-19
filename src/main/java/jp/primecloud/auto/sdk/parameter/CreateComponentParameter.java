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

public class CreateComponentParameter {

    private Long farmNo;

    private String componentName;

    private Long componentTypeNo;

    private Integer diskSize;

    private String comment;

    public CreateComponentParameter(Long farmNo, String componentName, Long componentTypeNo, Integer diskSize) {
        this.farmNo = farmNo;
        this.componentName = componentName;
        this.componentTypeNo = componentTypeNo;
        this.diskSize = diskSize;
    }

    public CreateComponentParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Long getFarmNo() {
        return farmNo;
    }

    public String getComponentName() {
        return componentName;
    }

    public Long getComponentTypeNo() {
        return componentTypeNo;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public String getComment() {
        return comment;
    }

}
