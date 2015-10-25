package jp.primecloud.auto.sdk.parameter;

public class CreateLoadBalancerListenerParameter {

    private Long farmNo;

    private Long loadBalancerNo;

    private Integer loadBalancerPort;

    private Integer servicePort;

    private String protocol;

    private Long sslKeyNo;

    public CreateLoadBalancerListenerParameter(Long farmNo, Long loadBalancerNo, Integer loadBalancerPort,
            Integer servicePort, String protocol) {
        this.farmNo = farmNo;
        this.loadBalancerNo = loadBalancerNo;
        this.loadBalancerPort = loadBalancerPort;
        this.servicePort = servicePort;
        this.protocol = protocol;
    }

    public CreateLoadBalancerListenerParameter withSslKeyNo(Long sslKeyNo) {
        this.sslKeyNo = sslKeyNo;
        return this;
    }

    public Long getFarmNo() {
        return farmNo;
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
