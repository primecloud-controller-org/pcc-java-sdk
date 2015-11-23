package jp.primecloud.auto.sdk.client.platform;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.platform.Platform;

import org.junit.Before;
import org.junit.Test;

public class ListPlatformTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        List<Platform> platforms = pcc.listPlatform();

        assertNotNull(platforms);

        for (Platform platform : platforms) {
            System.out.println(JacksonUtils.toString(platform));
        }
    }

}
