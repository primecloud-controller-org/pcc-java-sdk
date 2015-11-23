package jp.primecloud.auto.sdk.client.loadbalancer;

import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.parameter.CreateLoadBalancerListenerParameter;

import org.junit.Before;
import org.junit.Test;

public class CreateLoadBalancerListenerTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        CreateLoadBalancerListenerParameter parameter = new CreateLoadBalancerListenerParameter(1L, 80, 80, "HTTP");

        pcc.createLoadBalancerListener(parameter);
    }

}
