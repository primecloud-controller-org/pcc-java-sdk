package jp.primecloud.auto.sdk.client.component;

import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.parameter.EditComponentParameter;

import org.junit.Before;
import org.junit.Test;

public class EditComponentTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        EditComponentParameter parameter = new EditComponentParameter(1L, 1L, 1);
        pcc.editComponent(parameter);
    }

}
