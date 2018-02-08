package org.lexus.rpc;


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

}
