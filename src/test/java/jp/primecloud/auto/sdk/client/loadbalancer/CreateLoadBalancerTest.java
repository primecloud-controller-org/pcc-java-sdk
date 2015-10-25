package jp.primecloud.auto.sdk.client.loadbalancer;

import static org.junit.Assert.assertNotNull;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.parameter.CreateLoadBalancerParameter;

import org.junit.Before;
import org.junit.Test;

public class CreateLoadBalancerTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        CreateLoadBalancerParameter parameter = new CreateLoadBalancerParameter(1L, "loadBalancerName", "aws", 2L, 1L);
        parameter.withComment("comment");
        parameter.withIsInternal(true);

        Long loadBalancerNo = pcc.createLoadBalancer(parameter);

        assertNotNull(loadBalancerNo);

        System.out.println(loadBalancerNo);
    }

}
