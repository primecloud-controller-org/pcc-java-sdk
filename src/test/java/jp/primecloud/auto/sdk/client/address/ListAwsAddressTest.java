package jp.primecloud.auto.sdk.client.address;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.address.AwsAddress;

import org.junit.Before;
import org.junit.Test;

public class ListAwsAddressTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        List<AwsAddress> awsAddresses = pcc.listAwsAddress(2L);

        assertNotNull(awsAddresses);

        for (AwsAddress awsAddress : awsAddresses) {
            System.out.println(JacksonUtils.toString(awsAddress));
        }
    }

}
