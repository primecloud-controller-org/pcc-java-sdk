package jp.primecloud.auto.sdk;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.NullNode;

public class JacksonUtils {

    private static final ObjectMapper objectMapper;

    static {
        objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
    }

    public static JsonNode readTree(String json) {
        if (json == null || json.length() == 0) {
            return null;
        }

        try {
            return objectMapper.readTree(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public static <T> T toObject(JsonNode jsonNode, TypeReference<T> typeReference) {
        if (jsonNode == null) {
            return null;
        }

        try {
            return (T) objectMapper.readValue(jsonNode.traverse(), typeReference);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonNode getField(JsonNode jsonNode, String fieldName) {
        String[] names = fieldName.split("\\.");
        for (String name : names) {
            jsonNode = jsonNode.get(name);
            if (jsonNode == null || jsonNode instanceof NullNode) {
                return jsonNode;
            }
        }

        return jsonNode;
    }

    public static String toString(Object object) {
        return toString(object, false);
    }

    public static String toString(Object object, boolean pretty) {
        if (object == null) {
            return null;
        }

        try {
            if (pretty) {
                return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
            } else {
                return objectMapper.writeValueAsString(object);
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
