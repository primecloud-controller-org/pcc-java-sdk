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
package jp.primecloud.auto.sdk.model.farm;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Farm {

    @JsonProperty("FarmNo")
    private Long farmNo;

    @JsonProperty("FarmName")
    private String farmName;

    @JsonProperty("DomainName")
    private String domainName;

    @JsonProperty("Comment")
    private String comment;

    public Long getFarmNo() {
        return farmNo;
    }

    public void setFarmNo(Long farmNo) {
        this.farmNo = farmNo;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
