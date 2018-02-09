package org.lexus.rpc;

import java.util.Map;

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

    /**
     * 获取attachments
     * @return
     */
    Map<String, String> getAttachments();

    /**
     * 根据key获取attachment
     * @param key
     * @return
     */
    String getAttachment(String key);

    /**
     * 根据key获取attachment，若key==null或者key.length==0的话
     * 返回defaultValue
     * @param key
     * @param defaultValue
     * @return
     */
    String getAttachment(String key, String defaultValue);



    int getTimeout();
}
