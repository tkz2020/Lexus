package org.lexus.rpc.common.logger;


/**
 * @author tukangzheng
 *
 */
public interface LoggerService {


    public void trace(String msg);


    public void trace(String msg, Throwable e);


    public void trace(String format, Object... argArray);


    public void debug(String msg);


    public void debug(String msg, Throwable e);


    public void debug(String format, Object... argArray);


    public void info(String msg);


    public void info(String msg, Throwable e);


    public void info(String format, Object... argArray);


    public void warn(String msg);


    public void warn(String msg, Throwable e);


    public void warn(String format, Object... argArray);


    public void error(String msg);


    public void error(String msg, Throwable e);


    public void error(String format, Object... argArray);


    public boolean isTraceEnabled();


    public boolean isDebugEnabled();


    public boolean isInfoEnabled();


    public boolean isWarnEnabled();


    public boolean isErrorEnabled();

}
