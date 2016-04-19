/*
 * Copyright 2016 SCSK Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jp.primecloud.auto.sdk;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang.BooleanUtils;

public class TestFactory {

    private static Requester requester;

    private static Pcc pcc;

    static {
        Properties properties = new Properties();
        try {
            properties.load(TestFactory.class.getResourceAsStream("/test.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String url = properties.getProperty("url");
        String accessId = properties.getProperty("accessId");
        String accessKey = properties.getProperty("accessKey");
        String ignoreCerts = properties.getProperty("ignoreCerts");

        PccOptions options = new PccOptions();
        options.withIgnoreCerts(BooleanUtils.toBooleanObject(ignoreCerts));

        requester = new Requester(url, accessId, accessKey, options);
        pcc = new Pcc(requester);
    }

    public static Requester getRequester() {
        return requester;
    }

    public static Pcc getPcc() {
        return pcc;
    }

}
