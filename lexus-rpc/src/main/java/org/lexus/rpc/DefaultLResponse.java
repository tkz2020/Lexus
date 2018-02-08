package org.lexus.rpc;

import java.io.Serializable;

public class DefaultLResponse implements Serializable, LResponse {

    private static final long serialVersionUID = -7748933008355881503L;

    private Object value;
    private Exception exception;
    private long requestId;
    private long processTime;
    private int timeout;

    public DefaultLResponse(){}

    public DefaultLResponse(long requestId){
        this.requestId = requestId;
    }

    public DefaultLResponse(LResponse lResponse){
        this.value = lResponse.getValue();
        this.exception = lResponse.getException();
        this.requestId = lResponse.getRequestId();
        this.processTime = lResponse.getProcessTime();
        this.timeout = lResponse.getTimeout();
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public Exception getException() {
        return null;
    }

    @Override
    public long getRequestId() {
        return 0;
    }

    @Override
    public long getProcessTime() {
        return 0;
    }

    @Override
    public void setProcessTime(long time) {

    }

    @Override
    public int getTimeout() {
        return 0;
    }
}
