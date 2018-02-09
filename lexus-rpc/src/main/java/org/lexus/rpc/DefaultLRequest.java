package org.lexus.rpc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * rpc request
 * @author tukangzheng
 */
public class DefaultLRequest implements Serializable, LRequest {

    private static final long serialVersionUID = -8829398798368597496L;

    private String interfaceName;
    private String methodName;
    private Object[] arguments;
    private Map<String, String> attachments = new HashMap<>();
    private long requestId;

    @Override
    public String getInterfaceName() {
        return null;
    }

    @Override
    public String getMethodName() {
        return null;
    }

    @Override
    public Object[] getArguments() {
        return new Object[0];
    }

    @Override
    public long getRequestId() {
        return 0;
    }

    @Override
    public Map<String, String> getAttachments() {
        return null;
    }

    @Override
    public String getAttachment(String key) {
        return attachments.get(key);
    }

    @Override
    public String getAttachment(String key, String defaultValue) {
        String result = attachments.get(key);
        if (result == null || result.length() == 0){
            result = defaultValue;
        }
        return result;
    }


    public void setAttachments(String key, String value){
        attachments.put(key, value);
    }
}
