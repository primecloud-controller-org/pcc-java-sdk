package jp.primecloud.auto.sdk.client.component;

import static org.junit.Assert.assertNotNull;
import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.Component;

import org.junit.Before;
import org.junit.Test;

public class DescribeComponentTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        Component component = pcc.describeComponent(1L, 1L);

        assertNotNull(component);

        System.out.println(JacksonUtils.toString(component));
    }

}
