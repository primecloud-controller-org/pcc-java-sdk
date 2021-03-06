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
package jp.primecloud.auto.sdk.client.loadbalancer;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.loadbalancer.LoadBalancer;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;

public class DescribeLoadBalancer {

    protected Requester requester;

    public DescribeLoadBalancer(Requester requester) {
        this.requester = requester;
    }

    public LoadBalancer execute(Long loadBalancerNo) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("LoadBalancerNo", loadBalancerNo.toString());

        JsonNode jsonNode = requester.execute("/DescribeLoadBalancer", parameters);
        jsonNode = JacksonUtils.getField(jsonNode, "LoadBalancer");

        return JacksonUtils.toObject(jsonNode, new TypeReference<LoadBalancer>() {
        });
    }

}
