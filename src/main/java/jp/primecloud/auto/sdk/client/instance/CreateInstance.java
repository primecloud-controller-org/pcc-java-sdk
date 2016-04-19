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
package jp.primecloud.auto.sdk.client.instance;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.CreateInstanceParameter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class CreateInstance {

    protected Requester requester;

    public CreateInstance(Requester requester) {
        this.requester = requester;
    }

    public Long execute(CreateInstanceParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", parameter.getFarmNo().toString());
        parameters.put("InstanceName", parameter.getInstanceName());
        parameters.put("ImageNo", parameter.getImageNo().toString());

        if (parameter.getComment() != null) {
            parameters.put("Comment", parameter.getComment());
        }

        if (parameter.getInstanceType() != null) {
            parameters.put("InstanceType", parameter.getInstanceType());
        }

        JsonNode jsonNode = requester.execute("/CreateInstance", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "InstanceNo");

        return JacksonUtils.toObject(jsonNode, new TypeReference<Long>() {
        });
    }

}
