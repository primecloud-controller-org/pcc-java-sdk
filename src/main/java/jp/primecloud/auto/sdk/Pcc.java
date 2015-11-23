package jp.primecloud.auto.sdk;

import java.util.List;

import jp.primecloud.auto.sdk.client.address.AddAwsAddress;
import jp.primecloud.auto.sdk.client.address.DeleteAwsAddress;
import jp.primecloud.auto.sdk.client.address.EditAwsAddress;
import jp.primecloud.auto.sdk.client.address.ListAwsAddress;
import jp.primecloud.auto.sdk.client.component.AttachComponent;
import jp.primecloud.auto.sdk.client.component.CreateComponent;
import jp.primecloud.auto.sdk.client.component.DeleteComponent;
import jp.primecloud.auto.sdk.client.component.DescribeComponent;
import jp.primecloud.auto.sdk.client.component.DetachComponent;
import jp.primecloud.auto.sdk.client.component.EditComponent;
import jp.primecloud.auto.sdk.client.component.GetAttachableComponent;
import jp.primecloud.auto.sdk.client.component.ListComponent;
import jp.primecloud.auto.sdk.client.component.ListComponentType;
import jp.primecloud.auto.sdk.client.component.StartAllComponent;
import jp.primecloud.auto.sdk.client.component.StartComponent;
import jp.primecloud.auto.sdk.client.component.StopAllComponent;
import jp.primecloud.auto.sdk.client.component.StopComponent;
import jp.primecloud.auto.sdk.client.farm.CreateFarm;
import jp.primecloud.auto.sdk.client.farm.DeleteFarm;
import jp.primecloud.auto.sdk.client.farm.EditFarm;
import jp.primecloud.auto.sdk.client.farm.ListFarm;
import jp.primecloud.auto.sdk.client.image.ListImage;
import jp.primecloud.auto.sdk.client.instance.CreateInstance;
import jp.primecloud.auto.sdk.client.instance.DeleteInstance;
import jp.primecloud.auto.sdk.client.instance.DescribeInstance;
import jp.primecloud.auto.sdk.client.instance.DisableZabbixMonitoringInstance;
import jp.primecloud.auto.sdk.client.instance.EditInstanceAws;
import jp.primecloud.auto.sdk.client.instance.EnableZabbixMonitoringInstance;
import jp.primecloud.auto.sdk.client.instance.ListInstance;
import jp.primecloud.auto.sdk.client.instance.StartAllInstance;
import jp.primecloud.auto.sdk.client.instance.StartInstance;
import jp.primecloud.auto.sdk.client.instance.StopAllInstance;
import jp.primecloud.auto.sdk.client.instance.StopInstance;
import jp.primecloud.auto.sdk.client.loadbalancer.AttachLoadBalancer;
import jp.primecloud.auto.sdk.client.loadbalancer.CreateLoadBalancer;
import jp.primecloud.auto.sdk.client.loadbalancer.CreateLoadBalancerListener;
import jp.primecloud.auto.sdk.client.loadbalancer.DeleteLoadBalancer;
import jp.primecloud.auto.sdk.client.loadbalancer.DeleteLoadBalancerListener;
import jp.primecloud.auto.sdk.client.loadbalancer.DescribeLoadBalancer;
import jp.primecloud.auto.sdk.client.loadbalancer.DetachLoadBalancer;
import jp.primecloud.auto.sdk.client.loadbalancer.DisableLoadBalancerListener;
import jp.primecloud.auto.sdk.client.loadbalancer.EditLoadBalancer;
import jp.primecloud.auto.sdk.client.loadbalancer.EditLoadBalancerHealthCheck;
import jp.primecloud.auto.sdk.client.loadbalancer.EnableLoadBalancerListener;
import jp.primecloud.auto.sdk.client.loadbalancer.ListLoadBalancer;
import jp.primecloud.auto.sdk.client.loadbalancer.StartLoadBalancer;
import jp.primecloud.auto.sdk.client.loadbalancer.StopLoadBalancer;
import jp.primecloud.auto.sdk.client.platform.DescribePlatform;
import jp.primecloud.auto.sdk.client.platform.ListPlatform;
import jp.primecloud.auto.sdk.client.template.ListTemplate;
import jp.primecloud.auto.sdk.model.address.AwsAddress;
import jp.primecloud.auto.sdk.model.component.Component;
import jp.primecloud.auto.sdk.model.component.ComponentInstance;
import jp.primecloud.auto.sdk.model.component.ComponentType;
import jp.primecloud.auto.sdk.model.farm.Farm;
import jp.primecloud.auto.sdk.model.image.Image;
import jp.primecloud.auto.sdk.model.instance.Instance;
import jp.primecloud.auto.sdk.model.loadbalancer.LoadBalancer;
import jp.primecloud.auto.sdk.model.platform.Platform;
import jp.primecloud.auto.sdk.model.template.Template;
import jp.primecloud.auto.sdk.parameter.CreateComponentParameter;
import jp.primecloud.auto.sdk.parameter.CreateInstanceParameter;
import jp.primecloud.auto.sdk.parameter.CreateLoadBalancerListenerParameter;
import jp.primecloud.auto.sdk.parameter.CreateLoadBalancerParameter;
import jp.primecloud.auto.sdk.parameter.EditComponentParameter;
import jp.primecloud.auto.sdk.parameter.EditInstanceAwsParameter;
import jp.primecloud.auto.sdk.parameter.EditLoadBalancerHealthCheckParameter;
import jp.primecloud.auto.sdk.parameter.EditLoadBalancerParameter;

public class Pcc {

    protected Requester requester;

    public Pcc(String url, String accessId, String accessKey) {
        this(url, accessId, accessKey, null);
    }

    public Pcc(String url, String accessId, String accessKey, PccOptions options) {
        this(new Requester(url, accessId, accessKey, options));
    }

    public Pcc(Requester requester) {
        this.requester = requester;
    }

    public List<Farm> listFarm() {
        return new ListFarm(requester).execute();
    }

    public Long createFarm(String farmName, Long templateNo, String comment) {
        return new CreateFarm(requester).execute(farmName, templateNo, comment);
    }

    public void editFarm(Long farmNo, String comment) {
        new EditFarm(requester).execute(farmNo, comment);
    }

    public void deleteFarm(Long farmNo) {
        new DeleteFarm(requester).execute(farmNo);
    }

    public List<Instance> listInstance(Long farmNo) {
        return new ListInstance(requester).execute(farmNo);
    }

    public Instance describeInstance(Long instanceNo) {
        return new DescribeInstance(requester).execute(instanceNo);
    }

    public Long createInstance(CreateInstanceParameter parameter) {
        return new CreateInstance(requester).execute(parameter);
    }

    public void editInstanceAws(EditInstanceAwsParameter parameter) {
        new EditInstanceAws(requester).execute(parameter);
    }

    public void deleteInstance(Long instanceNo) {
        new DeleteInstance(requester).execute(instanceNo);
    }

    public void startInstance(Long instanceNo) {
        new StartInstance(requester).execute(instanceNo);
    }

    public void startInstance(Long instanceNo, Boolean isStartService) {
        new StartInstance(requester).execute(instanceNo, isStartService);
    }

    public void stopInstance(Long farmNo, Long instanceNo) {
        new StopInstance(requester).execute(farmNo, instanceNo);
    }

    public void startAllInstance(Long farmNo) {
        new StartAllInstance(requester).execute(farmNo);
    }

    public void startAllInstance(Long farmNo, Boolean isStartService) {
        new StartAllInstance(requester).execute(farmNo, isStartService);
    }

    public void stopAllInstance(Long farmNo) {
        new StopAllInstance(requester).execute(farmNo);
    }

    public void enableZabbixMonitoringInstance(Long instanceNo) {
        new EnableZabbixMonitoringInstance(requester).execute(instanceNo);
    }

    public void disableZabbixMonitoringInstance(Long instanceNo) {
        new DisableZabbixMonitoringInstance(requester).execute(instanceNo);
    }

    public List<ComponentType> listComponentType(Long farmNo) {
        return new ListComponentType(requester).execute(farmNo);
    }

    public List<Component> listComponent(Long farmNo) {
        return new ListComponent(requester).execute(farmNo);
    }

    public Component describeComponent(Long componentNo) {
        return new DescribeComponent(requester).execute(componentNo);
    }

    public Long createComponent(CreateComponentParameter parameter) {
        return new CreateComponent(requester).execute(parameter);
    }

    public void editComponent(EditComponentParameter parameter) {
        new EditComponent(requester).execute(parameter);
    }

    public void deleteComponent(Long componentNo) {
        new DeleteComponent(requester).execute(componentNo);
    }

    public List<ComponentInstance> getAttachableComponent(Long componentNo) {
        return new GetAttachableComponent(requester).execute(componentNo);
    }

    public void attachComponent(Long componentNo, Long instanceNo) {
        new AttachComponent(requester).execute(componentNo, instanceNo);
    }

    public void detachComponent(Long componentNo, Long instanceNo) {
        new DetachComponent(requester).execute(componentNo, instanceNo);
    }

    public void startComponent(Long componentNo, List<Long> instanceNos) {
        new StartComponent(requester).execute(componentNo, instanceNos);
    }

    public void stopComponent(Long componentNo, List<Long> instanceNos) {
        new StopComponent(requester).execute(componentNo, instanceNos);
    }

    public void stopComponent(Long componentNo, List<Long> instanceNos, Boolean isStopInstance) {
        new StopComponent(requester).execute(componentNo, instanceNos, isStopInstance);
    }

    public void startAllComponent(Long farmNo) {
        new StartAllComponent(requester).execute(farmNo);
    }

    public void stopAllComponent(Long farmNo) {
        new StopAllComponent(requester).execute(farmNo);
    }

    public void stopAllComponent(Long farmNo, Boolean isStopInstance) {
        new StopAllComponent(requester).execute(farmNo, isStopInstance);
    }

    public List<LoadBalancer> listLoadBalancer(Long farmNo) {
        return new ListLoadBalancer(requester).execute(farmNo);
    }

    public LoadBalancer describeLoadBalancer(Long loadBalancerNo) {
        return new DescribeLoadBalancer(requester).execute(loadBalancerNo);
    }

    public Long createLoadBalancer(CreateLoadBalancerParameter parameter) {
        return new CreateLoadBalancer(requester).execute(parameter);
    }

    public void editLoadBalancer(EditLoadBalancerParameter parameter) {
        new EditLoadBalancer(requester).execute(parameter);
    }

    public void deleteLoadBalancer(Long loadBalancerNo) {
        new DeleteLoadBalancer(requester).execute(loadBalancerNo);
    }

    public void attachLoadBalancer(Long loadBalancerNo, Long instanceNo) {
        new AttachLoadBalancer(requester).execute(loadBalancerNo, instanceNo);
    }

    public void detachLoadBalancer(Long loadBalancerNo, Long instanceNo) {
        new DetachLoadBalancer(requester).execute(loadBalancerNo, instanceNo);
    }

    public void startLoadBalancer(Long loadBalancerNo) {
        new StartLoadBalancer(requester).execute(loadBalancerNo);
    }

    public void stopLoadBalancer(Long loadBalancerNo) {
        new StopLoadBalancer(requester).execute(loadBalancerNo);
    }

    public void editLoadBalancerHealthCheck(EditLoadBalancerHealthCheckParameter parameter) {
        new EditLoadBalancerHealthCheck(requester).execute(parameter);
    }

    public void createLoadBalancerListener(CreateLoadBalancerListenerParameter parameter) {
        new CreateLoadBalancerListener(requester).execute(parameter);
    }

    public void deleteLoadBalancerListener(Long loadBalancerNo, Integer loadBalancerPort) {
        new DeleteLoadBalancerListener(requester).execute(loadBalancerNo, loadBalancerPort);
    }

    public void enableLoadBalancerListener(Long loadBalancerNo, Integer loadBalancerPort) {
        new EnableLoadBalancerListener(requester).execute(loadBalancerNo, loadBalancerPort);
    }

    public void disableLoadBalancerListener(Long loadBalancerNo, Integer loadBalancerPort) {
        new DisableLoadBalancerListener(requester).execute(loadBalancerNo, loadBalancerPort);
    }

    public List<Platform> listPlatform() {
        return new ListPlatform(requester).execute();
    }

    public Platform describePlatform(Long platformNo) {
        return new DescribePlatform(requester).execute(platformNo);
    }

    public List<Image> listImage(Long platformNo) {
        return new ListImage(requester).execute(platformNo);
    }

    public List<AwsAddress> listAwsAddress(Long platformNo) {
        return new ListAwsAddress(requester).execute(platformNo);
    }

    public AwsAddress addAwsAddress(Long platformNo, Long farmNo) {
        return new AddAwsAddress(requester).execute(platformNo, farmNo);
    }

    public void editAwsAddress(Long addressNo, String comment) {
        new EditAwsAddress(requester).execute(addressNo, comment);
    }

    public void deleteAwsAddress(Long addressNo, Long farmNo) {
        new DeleteAwsAddress(requester).execute(addressNo, farmNo);
    }

    public List<Template> listTemplate() {
        return new ListTemplate(requester).execute();
    }

}
