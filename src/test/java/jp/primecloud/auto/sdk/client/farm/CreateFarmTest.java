package jp.primecloud.auto.sdk.client.farm;

import static org.junit.Assert.assertNotNull;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;

import org.junit.Before;
import org.junit.Test;

public class CreateFarmTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        Long farmNo = pcc.createFarm("famrName", 91L, "comment");

        assertNotNull(farmNo);

        System.out.println(farmNo);
    }

}
