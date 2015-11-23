package jp.primecloud.auto.sdk.client.address;

import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;

import org.junit.Before;
import org.junit.Test;

public class DeleteAwsAddressTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        pcc.deleteAwsAddress(1L, 1L);
    }

}
