package jp.primecloud.auto.sdk.client.loadbalancer;

import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.parameter.EditLoadBalancerParameter;

import org.junit.Before;
import org.junit.Test;

public class EditLoadBalancerTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        EditLoadBalancerParameter parameter = new EditLoadBalancerParameter(1L, 1L, 1L, "securityGroups");
        parameter.withComment("comment");
        parameter.withSubnet("subnet");
        parameter.withIsInternal(false);

        pcc.editLoadBalancer(parameter);
    }

}
