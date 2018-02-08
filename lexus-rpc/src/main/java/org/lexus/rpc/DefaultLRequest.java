package org.lexus.rpc;

import java.io.Serializable;


/**
 * rpc request
 * @author tukangzheng
 */
public class DefaultLRequest implements Serializable, LRequest {

    private static final long serialVersionUID = -8829398798368597496L;

    private String interfaceName;
    private String methodName;
    private Object[] arguments;

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
}
