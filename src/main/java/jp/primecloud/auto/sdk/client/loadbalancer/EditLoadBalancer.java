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

import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.EditLoadBalancerParameter;

public class EditLoadBalancer {

    protected Requester requester;

    public EditLoadBalancer(Requester requester) {
        this.requester = requester;
    }

    public void execute(EditLoadBalancerParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("LoadBalancerNo", parameter.getLoadBalancerNo().toString());
        parameters.put("ComponentNo", parameter.getComponentNo().toString());
        parameters.put("SecurityGroups", parameter.getSecurityGroups());

        if (parameter.getComment() != null) {
            parameters.put("Comment", parameter.getComment());
        }

        if (parameter.getSubnet() != null) {
            parameters.put("Subnet", parameter.getSubnet());
        }

        if (parameter.getIsInternal() != null) {
            parameters.put("IsInternal", parameter.getIsInternal().toString());
        }

        requester.execute("/EditLoadBalancer", parameters);
    }

}
