package jp.primecloud.auto.sdk.client.instance;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.Instance;

import org.junit.Before;
import org.junit.Test;

public class ListInstanceTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        List<Instance> instances = pcc.listInstance(1L);

        assertNotNull(instances);

        for (Instance instance : instances) {
            System.out.println(JacksonUtils.toString(instance));
        }
    }

}
