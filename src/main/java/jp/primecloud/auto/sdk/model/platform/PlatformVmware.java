package jp.primecloud.auto.sdk.model.platform;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlatformVmware {

    @JsonProperty("Url")
    private String url;

    @JsonProperty("Datacenter")
    private String datacenter;

    @JsonProperty("PublicNetwork")
    private String publicNetwork;

    @JsonProperty("PrivateNetwork")
    private String privateNetwork;

    @JsonProperty("Computresource")
    private String computresource;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDatacenter() {
        return datacenter;
    }

    public void setDatacenter(String datacenter) {
        this.datacenter = datacenter;
    }

    public String getPublicNetwork() {
        return publicNetwork;
    }

    public void setPublicNetwork(String publicNetwork) {
        this.publicNetwork = publicNetwork;
    }

    public String getPrivateNetwork() {
        return privateNetwork;
    }

    public void setPrivateNetwork(String privateNetwork) {
        this.privateNetwork = privateNetwork;
    }

    public String getComputresource() {
        return computresource;
    }

    public void setComputresource(String computresource) {
        this.computresource = computresource;
    }

}
