package jp.primecloud.auto.sdk.client.platform;

import static org.junit.Assert.assertNotNull;
import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.platform.Platform;

import org.junit.Before;
import org.junit.Test;

public class DescribePlatformTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        Platform platform = pcc.describePlatform(2L);

        assertNotNull(platform);

        System.out.println(JacksonUtils.toString(platform));
    }

}
