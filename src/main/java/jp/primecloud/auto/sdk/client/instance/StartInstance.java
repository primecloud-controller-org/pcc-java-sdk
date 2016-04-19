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

public class StartInstance {

    protected Requester requester;

    public StartInstance(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long instanceNo) {
        execute(instanceNo, null);
    }

    public void execute(Long instanceNo, Boolean isStartService) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("InstanceNo", instanceNo.toString());

        if (isStartService != null) {
            parameters.put("IsStartService", isStartService.toString());
        }

        requester.execute("/StartInstance", parameters);
    }

}
