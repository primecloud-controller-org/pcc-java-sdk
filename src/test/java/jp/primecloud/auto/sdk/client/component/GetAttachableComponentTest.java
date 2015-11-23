package jp.primecloud.auto.sdk.client.component;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.component.ComponentInstance;

import org.junit.Before;
import org.junit.Test;

public class GetAttachableComponentTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        List<ComponentInstance> componentInstances = pcc.getAttachableComponent(1L);

        assertNotNull(componentInstances);

        for (ComponentInstance componentInstance : componentInstances) {
            System.out.println(JacksonUtils.toString(componentInstance));
        }
    }

}
