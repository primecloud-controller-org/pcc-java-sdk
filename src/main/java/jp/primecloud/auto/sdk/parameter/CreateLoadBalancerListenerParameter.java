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

public class CreateLoadBalancerListenerParameter {

    private Long loadBalancerNo;

    private Integer loadBalancerPort;

    private Integer servicePort;

    private String protocol;

    private Long sslKeyNo;

    public CreateLoadBalancerListenerParameter(Long loadBalancerNo, Integer loadBalancerPort, Integer servicePort,
            String protocol) {
        this.loadBalancerNo = loadBalancerNo;
        this.loadBalancerPort = loadBalancerPort;
        this.servicePort = servicePort;
        this.protocol = protocol;
    }

    public CreateLoadBalancerListenerParameter withSslKeyNo(Long sslKeyNo) {
        this.sslKeyNo = sslKeyNo;
        return this;
    }

    public Long getLoadBalancerNo() {
        return loadBalancerNo;
    }

    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }

    public Integer getServicePort() {
        return servicePort;
    }

    public String getProtocol() {
        return protocol;
    }

    public Long getSslKeyNo() {
        return sslKeyNo;
    }

}
