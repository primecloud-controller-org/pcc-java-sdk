package jp.primecloud.auto.sdk.client.instance;

import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.parameter.EditInstanceAwsParameter;

import org.junit.Before;
import org.junit.Test;

public class EditInstanceAwsTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        EditInstanceAwsParameter parameter = new EditInstanceAwsParameter(1L, "instanceType", "keyName",
                "securityGroups", "subnet");
        pcc.editInstanceAws(parameter);
    }

}
