package jp.primecloud.auto.sdk.client.component;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.Component;

import org.junit.Before;
import org.junit.Test;

public class ListComponentTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        List<Component> components = pcc.listComponent(1L);

        assertNotNull(components);

        for (Component component : components) {
            System.out.println(JacksonUtils.toString(component));
        }
    }

}
