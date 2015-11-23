package jp.primecloud.auto.sdk.client.instance;

import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;

import org.junit.Before;
import org.junit.Test;

public class DeleteInstanceTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        pcc.deleteInstance(1L);
    }

}
