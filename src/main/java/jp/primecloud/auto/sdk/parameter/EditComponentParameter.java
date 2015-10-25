package jp.primecloud.auto.sdk.parameter;

public class EditComponentParameter {

    private Long farmNo;

    private Long componentNo;

    private Integer diskSize;

    private String comment;

    private String customParam1;

    private String customParam2;

    private String customParam3;

    public EditComponentParameter(Long farmNo, Long componentNo, Integer diskSize) {
        this.farmNo = farmNo;
        this.componentNo = componentNo;
        this.diskSize = diskSize;
    }

    public EditComponentParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public EditComponentParameter withCustomParam1(String customParam1) {
        this.customParam1 = customParam1;
        return this;
    }

    public EditComponentParameter withCustomParam2(String customParam2) {
        this.customParam2 = customParam3;
        return this;
    }

    public EditComponentParameter withCustomParam3(String customParam3) {
        this.customParam3 = customParam3;
        return this;
    }

    public Long getFarmNo() {
        return farmNo;
    }

    public Long getComponentNo() {
        return componentNo;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public String getComment() {
        return comment;
    }

    public String getCustomParam1() {
        return customParam1;
    }

    public String getCustomParam2() {
        return customParam2;
    }

    public String getCustomParam3() {
        return customParam3;
    }

}
