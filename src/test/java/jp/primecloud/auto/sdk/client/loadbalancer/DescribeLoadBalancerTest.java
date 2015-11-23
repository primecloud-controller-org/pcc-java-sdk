package jp.primecloud.auto.sdk.client.loadbalancer;

import static org.junit.Assert.assertNotNull;
import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.loadbalancer.LoadBalancer;

import org.junit.Before;
import org.junit.Test;

public class DescribeLoadBalancerTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        LoadBalancer loadBalancer = pcc.describeLoadBalancer(1L);

        assertNotNull(loadBalancer);

        System.out.println(JacksonUtils.toString(loadBalancer));
    }

}
