package jp.primecloud.auto.sdk.client.address;

import static org.junit.Assert.assertNotNull;
import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.address.AwsAddress;

import org.junit.Before;
import org.junit.Test;

public class AddAwsAddressTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        AwsAddress awsAddress = pcc.addAwsAddress(2L, 1L);

        assertNotNull(awsAddress);

        System.out.println(JacksonUtils.toString(awsAddress));
    }

}
