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
package jp.primecloud.auto.sdk.client.component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;

import org.apache.commons.lang.StringUtils;

public class StartComponent {

    protected Requester requester;

    public StartComponent(Requester requester) {
        this.requester = requester;
    }

    public void execute(Long componentNo, List<Long> instanceNos) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("ComponentNo", componentNo.toString());
        parameters.put("InstanceNos", StringUtils.join(instanceNos, ","));

        requester.execute("/StartComponent", parameters);
    }

}
