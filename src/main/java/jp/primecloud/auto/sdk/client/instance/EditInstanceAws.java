package jp.primecloud.auto.sdk.client.instance;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.primecloud.auto.sdk.Requester;
import jp.primecloud.auto.sdk.parameter.EditInstanceAwsParameter;

public class EditInstanceAws {

    protected Requester requester;

    public EditInstanceAws(Requester requester) {
        this.requester = requester;
    }

    public void execute(EditInstanceAwsParameter parameter) {
        Map<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("FarmNo", parameter.getFarmNo().toString());
        parameters.put("InstanceNo", parameter.getInstanceNo().toString());
        parameters.put("InstanceType", parameter.getInstanceType());
        parameters.put("KeyName", parameter.getKeyName());
        parameters.put("SecurityGroups", parameter.getSecurityGroups());
        parameters.put("Subnet", parameter.getSubnet());

        if (parameter.getAvailabilityZone() != null) {
            parameters.put("AvailabilityZone", parameter.getAvailabilityZone());
        }

        if (parameter.getIpAddress() != null) {
            parameters.put("IpAddress", parameter.getIpAddress());
        }
        if (parameter.getPrivateIpAddress() != null) {
            parameters.put("PrivateIpAddress", parameter.getPrivateIpAddress());
        }

        if (parameter.getComment() != null) {
            parameters.put("Comment", parameter.getComment());
        }

        requester.execute("/EditInstance", parameters);
    }

}
