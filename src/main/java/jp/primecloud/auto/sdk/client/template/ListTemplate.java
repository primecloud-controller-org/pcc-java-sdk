package jp.primecloud.auto.sdk.client.template;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jp.primecloud.auto.sdk.JacksonUtils;
import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.model.Template;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class ListTemplate {

    protected Requester requester;

    public ListTemplate(Requester requester) {
        this.requester = requester;
    }

    public List<Template> execute() {
        JsonNode jsonNode = requester.execute("/ListTemplate");
        jsonNode = JacksonUtils.getField(jsonNode, "Templates.Template");

        if (jsonNode == null) {
            return new ArrayList<Template>();
        }

        if (jsonNode instanceof ObjectNode) {
            Template template = JacksonUtils.toObject(jsonNode, new TypeReference<Template>() {
            });
            return Arrays.asList(template);
        }

        return JacksonUtils.toObject(jsonNode, new TypeReference<List<Template>>() {
        });
    }

}
