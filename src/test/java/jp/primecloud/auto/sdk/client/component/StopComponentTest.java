package jp.primecloud.auto.sdk.client.component;

import java.util.Arrays;

import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;

import org.junit.Before;
import org.junit.Test;

public class StopComponentTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        pcc.stopComponent(1L, 1L, Arrays.asList(1L));
    }

}
