package jp.primecloud.auto.sdk.client.image;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Pcc;
import jp.primecloud.auto.sdk.TestFactory;
import jp.primecloud.auto.sdk.model.image.Image;

import org.junit.Before;
import org.junit.Test;

public class ListImageTest {

    Pcc pcc;

    @Before
    public void setUp() throws Exception {
        pcc = TestFactory.getPcc();
    }

    @Test
    public void test() {
        List<Image> images = pcc.listImage(2L);

        assertNotNull(images);

        for (Image image : images) {
            System.out.println(JacksonUtils.toString(image));
        }
    }

}
