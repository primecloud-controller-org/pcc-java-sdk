package jp.primecloud.auto.sdk;

import java.util.List;

import jp.primecloud.auto.sdk.client.component.AttachComponent;
import jp.primecloud.auto.sdk.client.component.CreateComponent;
import jp.primecloud.auto.sdk.client.component.DeleteComponent;
import jp.primecloud.auto.sdk.client.component.DescribeComponent;
import jp.primecloud.auto.sdk.client.component.DetachComponent;
import jp.primecloud.auto.sdk.client.component.EditComponent;
import jp.primecloud.auto.sdk.client.component.ListComponent;
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
import jp.primecloud.auto.sdk.client.platform.ListPlatform;
import jp.primecloud.auto.sdk.client.template.ListTemplate;
import jp.primecloud.auto.sdk.model.Component;
import jp.primecloud.auto.sdk.model.Farm;
import jp.primecloud.auto.sdk.model.Image;
import jp.primecloud.auto.sdk.model.Instance;
import jp.primecloud.auto.sdk.model.LoadBalancer;
import jp.primecloud.auto.sdk.model.Platform;
import jp.primecloud.auto.sdk.model.Template;
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

    public Instance describeInstance(Long farmNo, Long instanceNo) {
        return new DescribeInstance(requester).execute(farmNo, instanceNo);
    }

    public Long createInstance(CreateInstanceParameter parameter) {
        return new CreateInstance(requester).execute(parameter);
    }

    public void editInstanceAws(EditInstanceAwsParameter parameter) {
        new EditInstanceAws(requester).execute(parameter);
    }

    public void deleteInstance(Long farmNo, Long instanceNo) {
        new DeleteInstance(requester).execute(farmNo, instanceNo);
    }

    public void startInstance(Long farmNo, Long instanceNo) {
        new StartInstance(requester).execute(farmNo, instanceNo);
    }

    public void startInstance(Long farmNo, Long instanceNo, Boolean isStartService) {
        new StartInstance(requester).execute(farmNo, instanceNo, isStartService);
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

    public void enableZabbixMonitoringInstance(Long farmNo, Long instanceNo) {
        new EnableZabbixMonitoringInstance(requester).execute(farmNo, instanceNo);
    }

    public void disableZabbixMonitoringInstance(Long farmNo, Long instanceNo) {
        new DisableZabbixMonitoringInstance(requester).execute(farmNo, instanceNo);
    }

    public List<Component> listComponent(Long farmNo) {
        return new ListComponent(requester).execute(farmNo);
    }

    public Component describeComponent(Long farmNo, Long componentNo) {
        return new DescribeComponent(requester).execute(farmNo, componentNo);
    }

    public Long createComponent(CreateComponentParameter parameter) {
        return new CreateComponent(requester).execute(parameter);
    }

    public void editComponent(EditComponentParameter parameter) {
        new EditComponent(requester).execute(parameter);
    }

    public void deleteComponent(Long farmNo, Long componentNo) {
        new DeleteComponent(requester).execute(farmNo, componentNo);
    }

    public void attachComponent(Long farmNo, Long componentNo, Long instanceNo) {
        new AttachComponent(requester).execute(farmNo, componentNo, instanceNo);
    }

    public void detachComponent(Long farmNo, Long componentNo, Long instanceNo) {
        new DetachComponent(requester).execute(farmNo, componentNo, instanceNo);
    }

    public void startComponent(Long farmNo, Long componentNo, List<Long> instanceNos) {
        new StartComponent(requester).execute(farmNo, componentNo, instanceNos);
    }

    public void stopComponent(Long farmNo, Long componentNo, List<Long> instanceNos) {
        new StopComponent(requester).execute(farmNo, componentNo, instanceNos);
    }

    public void stopComponent(Long farmNo, Long componentNo, List<Long> instanceNos, Boolean isStopInstance) {
        new StopComponent(requester).execute(farmNo, componentNo, instanceNos, isStopInstance);
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

    public LoadBalancer describeLoadBalancer(Long farmNo, Long loadBalancerNo) {
        return new DescribeLoadBalancer(requester).execute(farmNo, loadBalancerNo);
    }

    public Long createLoadBalancer(CreateLoadBalancerParameter parameter) {
        return new CreateLoadBalancer(requester).execute(parameter);
    }

    public void editLoadBalancer(EditLoadBalancerParameter parameter) {
        new EditLoadBalancer(requester).execute(parameter);
    }

    public void deleteLoadBalancer(Long farmNo, Long loadBalancerNo) {
        new DeleteLoadBalancer(requester).execute(farmNo, loadBalancerNo);
    }

    public void attachLoadBalancer(Long farmNo, Long loadBalancerNo, Long instanceNo) {
        new AttachLoadBalancer(requester).execute(farmNo, loadBalancerNo, instanceNo);
    }

    public void detachLoadBalancer(Long farmNo, Long loadBalancerNo, Long instanceNo) {
        new DetachLoadBalancer(requester).execute(farmNo, loadBalancerNo, instanceNo);
    }

    public void startLoadBalancer(Long farmNo, Long loadBalancerNo) {
        new StartLoadBalancer(requester).execute(farmNo, loadBalancerNo);
    }

    public void stopLoadBalancer(Long farmNo, Long loadBalancerNo) {
        new StopLoadBalancer(requester).execute(farmNo, loadBalancerNo);
    }

    public void editLoadBalancerHealthCheck(EditLoadBalancerHealthCheckParameter parameter) {
        new EditLoadBalancerHealthCheck(requester).execute(parameter);
    }

    public void createLoadBalancerListener(CreateLoadBalancerListenerParameter parameter) {
        new CreateLoadBalancerListener(requester).execute(parameter);
    }

    public void deleteLoadBalancerListener(Long farmNo, Long loadBalancerNo, Integer loadBalancerPort) {
        new DeleteLoadBalancerListener(requester).execute(farmNo, loadBalancerNo, loadBalancerPort);
    }

    public void enableLoadBalancerListener(Long farmNo, Long loadBalancerNo, Integer loadBalancerPort) {
        new EnableLoadBalancerListener(requester).execute(farmNo, loadBalancerNo, loadBalancerPort);
    }

    public void disableLoadBalancerListener(Long farmNo, Long loadBalancerNo, Integer loadBalancerPort) {
        new DisableLoadBalancerListener(requester).execute(farmNo, loadBalancerNo, loadBalancerPort);
    }

    public List<Platform> listPlatform(Long farmNo) {
        return new ListPlatform(requester).execute(farmNo);
    }

    public List<Image> listImage(Long farmNo, Long platformNo) {
        return new ListImage(requester).execute(farmNo, platformNo);
    }

    public List<Template> listTemplate() {
        return new ListTemplate(requester).execute();
    }

}
