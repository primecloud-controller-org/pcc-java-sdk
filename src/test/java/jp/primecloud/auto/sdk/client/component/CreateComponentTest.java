package jp.primecloud.auto.sdk.client.component;

import static org.junit.Assert.assertNotNull;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.parameter.CreateComponentParameter;

import org.junit.Before;
import org.junit.Test;

public class CreateComponentTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        CreateComponentParameter parameter = new CreateComponentParameter(1L, "componentName", 1L, 1);
        parameter.withComment("comment");

        Long componentNo = pcc.createComponent(parameter);

        assertNotNull(componentNo);

        System.out.println(componentNo);
    }

}
