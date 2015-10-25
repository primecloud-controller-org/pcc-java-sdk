package jp.primecloud.auto.sdk.client.loadbalancer;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.LoadBalancer;

import org.junit.Before;
import org.junit.Test;

public class ListLoadBalancerTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        List<LoadBalancer> loadBalancers = pcc.listLoadBalancer(1L);

        assertNotNull(loadBalancers);

        for (LoadBalancer loadBalancer : loadBalancers) {
            System.out.println(JacksonUtils.toString(loadBalancer));
        }
    }

}
