package jp.primecloud.auto.sdk.client.template;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.Template;

import org.junit.Before;
import org.junit.Test;

public class ListTemplateTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        List<Template> templates = pcc.listTemplate();

        assertNotNull(templates);

        for (Template template : templates) {
            System.out.println(JacksonUtils.toString(template));
        }
    }

}
