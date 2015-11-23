package jp.primecloud.auto.sdk.client.instance;

import static org.junit.Assert.assertNotNull;
import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.instance.Instance;

import org.junit.Before;
import org.junit.Test;

public class DescribeInstanceTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        Instance instance = pcc.describeInstance(1L);

        assertNotNull(instance);

        System.out.println(JacksonUtils.toString(instance));
    }

}
