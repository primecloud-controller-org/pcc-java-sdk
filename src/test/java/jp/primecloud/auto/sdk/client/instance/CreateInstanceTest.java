package jp.primecloud.auto.sdk.client.instance;

import static org.junit.Assert.assertNotNull;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.parameter.CreateInstanceParameter;

import org.junit.Before;
import org.junit.Test;

public class CreateInstanceTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        CreateInstanceParameter parameter = new CreateInstanceParameter(1L, "instanceName", 101L);
        parameter.withComment("comment");

        Long instanceNo = pcc.createInstance(parameter);

        assertNotNull(instanceNo);

        System.out.println(instanceNo);
    }

}
