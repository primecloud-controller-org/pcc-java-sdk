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
