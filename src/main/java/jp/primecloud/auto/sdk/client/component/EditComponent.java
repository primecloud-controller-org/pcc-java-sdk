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
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.EditComponentParameter;

public class EditComponent {

    protected Requester requester;

    public EditComponent(Requester requester) {
        this.requester = requester;
    }

    public void execute(EditComponentParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("ComponentNo", parameter.getComponentNo().toString());
        parameters.put("DiskSize", parameter.getDiskSize().toString());

        if (parameter.getComment() != null) {
            parameters.put("Comment", parameter.getComment());
        }

        if (parameter.getCustomParam1() != null) {
            parameters.put("CustomParam1", parameter.getCustomParam1());
        }

        if (parameter.getCustomParam2() != null) {
            parameters.put("CustomParam2", parameter.getCustomParam2());
        }

        if (parameter.getCustomParam3() != null) {
            parameters.put("CustomParam3", parameter.getCustomParam3());
        }

        requester.execute("/EditComponent", parameters);
    }

}
