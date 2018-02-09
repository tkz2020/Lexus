package org.lexus.rpc;


import java.util.Map;

/**
 * Request
 * @author tukangzheng
 */
public interface LRequest {

    /**
     * service interface Name
     * @return
     */
    String getInterfaceName();


    /**
     * service method Name
     * @return
     */
    String getMethodName();


    /**
     * service arguments
     * @return
     */
    Object[] getArguments();


    /**
     * request id
     * @return
     */
    long getRequestId();

    /**
     * get attachments.
     *
     * @return attachments.
     * @serial
     */
    Map<String, String> getAttachments();


    /**
     * get attachment by key.
     *
     * @return attachment value.
     * @serial
     */
    String getAttachment(String key);


    /**
     * get attachment by key with default value.
     *
     * @return attachment value.
     * @serial
     */
    String getAttachment(String key, String defaultValue);




}
