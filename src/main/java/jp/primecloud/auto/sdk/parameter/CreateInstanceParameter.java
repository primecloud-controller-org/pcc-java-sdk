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

public class CreateInstanceParameter {

    private Long farmNo;

    private String instanceName;

    private Long imageNo;

    private String comment;

    private String instanceType;

    public CreateInstanceParameter(Long farmNo, String instanceName, Long imageNo) {
        this.farmNo = farmNo;
        this.instanceName = instanceName;
        this.imageNo = imageNo;
    }

    public CreateInstanceParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public CreateInstanceParameter withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public Long getFarmNo() {
        return farmNo;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public Long getImageNo() {
        return imageNo;
    }

    public String getComment() {
        return comment;
    }

    public String getInstanceType() {
        return instanceType;
    }

}
