package jp.primecloud.auto.sdk;

public class PccOptions {

    private Boolean ignoreCerts;

    public PccOptions withIgnoreCerts(Boolean ignoreCerts) {
        this.ignoreCerts = ignoreCerts;
        return this;
    }

    public Boolean getIgnoreCerts() {
        return ignoreCerts;
    }

}
