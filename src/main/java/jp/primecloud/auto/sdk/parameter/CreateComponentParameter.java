package jp.primecloud.auto.sdk.parameter;

public class CreateComponentParameter {

    private Long farmNo;

    private String componentName;

    private Long componentTypeNo;

    private Integer diskSize;

    private String comment;

    public CreateComponentParameter(Long farmNo, String componentName, Long componentTypeNo, Integer diskSize) {
        this.farmNo = farmNo;
        this.componentName = componentName;
        this.componentTypeNo = componentTypeNo;
        this.diskSize = diskSize;
    }

    public CreateComponentParameter withComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Long getFarmNo() {
        return farmNo;
    }

    public String getComponentName() {
        return componentName;
    }

    public Long getComponentTypeNo() {
        return componentTypeNo;
    }

    public Integer getDiskSize() {
        return diskSize;
    }

    public String getComment() {
        return comment;
    }

}
