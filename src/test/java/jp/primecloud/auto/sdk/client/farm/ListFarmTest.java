package jp.primecloud.auto.sdk.client.farm;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.Farm;

import org.junit.Before;
import org.junit.Test;

public class ListFarmTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        List<Farm> farms = pcc.listFarm();

        assertNotNull(farms);

        for (Farm farm : farms) {
            System.out.println(JacksonUtils.toString(farm));
        }
    }

}
