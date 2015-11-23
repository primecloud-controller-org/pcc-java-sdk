package jp.primecloud.auto.sdk.client.component;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.component.ComponentType;

import org.junit.Before;
import org.junit.Test;

public class ListComponentTypeTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        List<ComponentType> componentTypes = pcc.listComponentType(1L);

        assertNotNull(componentTypes);

        for (ComponentType componentType : componentTypes) {
            System.out.println(JacksonUtils.toString(componentType));
        }
    }

}
