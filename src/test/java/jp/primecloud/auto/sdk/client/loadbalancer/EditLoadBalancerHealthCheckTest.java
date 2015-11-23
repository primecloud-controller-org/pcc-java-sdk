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
