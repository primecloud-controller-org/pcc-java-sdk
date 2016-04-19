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

import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.parameter.EditLoadBalancerHealthCheckParameter;

import org.junit.Before;
import org.junit.Test;

public class EditLoadBalancerHealthCheckTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        EditLoadBalancerHealthCheckParameter parameter = new EditLoadBalancerHealthCheckParameter(1L, "HTTP", 80,
                "/index.html", 5, 10, 3, 2);

        pcc.editLoadBalancerHealthCheck(parameter);
    }

}
