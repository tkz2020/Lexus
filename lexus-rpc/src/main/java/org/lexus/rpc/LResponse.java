package org.lexus.rpc;

/**
 * Response
 * @author Administrator
 */
public interface LResponse {

    /**
     * Request正常处理返回结果
     * @return
     */
    Object getValue();

    /**
     * Request处理异常  返回Exception
     * @return
     */
    Exception getException();

    /**
     * 与 Request 的 requestId 相对应
     * @return
     */
    long getRequestId();

    /**
     * 业务处理时间
     *
     * @return
     */
    long getProcessTime();

    /**
     * 业务处理时间
     *
     * @param time
     */
    void setProcessTime(long time);

    int getTimeout();
}
