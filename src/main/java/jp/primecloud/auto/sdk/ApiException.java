package jp.primecloud.auto.sdk;

public class ApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String code;

    private String message;

    public ApiException(String message) {
        this.message = message;
    }

    public ApiException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }

}
