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

import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.EditInstanceVmwareParameter;

public class EditInstanceVmware {

    protected Requester requester;

    public EditInstanceVmware(Requester requester) {
        this.requester = requester;
    }

    public void execute(EditInstanceVmwareParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("InstanceNo", parameter.getInstanceNo().toString());
        parameters.put("InstanceType", parameter.getInstanceType());
        parameters.put("KeyName", parameter.getKeyName());
        parameters.put("ComputeResource", parameter.getComputeResource());
        parameters.put("IsStaticIp", parameter.getIsStaticIp().toString());

        if (parameter.getIpAddress() != null) {
            parameters.put("IpAddress", parameter.getIpAddress());
        }

        if (parameter.getSubnetMask() != null) {
            parameters.put("SubnetMask", parameter.getSubnetMask());
        }

        if (parameter.getDefaultGateway() != null) {
            parameters.put("DefaultGateway", parameter.getDefaultGateway());
        }

        if (parameter.getComment() != null) {
            parameters.put("Comment", parameter.getComment());
        }

        requester.execute("/EditInstanceVmware", parameters);
    }

}
