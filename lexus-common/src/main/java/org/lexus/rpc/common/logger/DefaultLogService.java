package org.lexus.rpc.common.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author tukangzheng
 * 默认实现的logger
 */
public class DefaultLogService implements LoggerService {

    private static Logger trace = LoggerFactory.getLogger("trace");
    private static Logger debug = LoggerFactory.getLogger("debug");
    private static Logger info = LoggerFactory.getLogger("info");
    private static Logger warn = LoggerFactory.getLogger("warn");
    private static Logger error = LoggerFactory.getLogger("error");


    @Override
    public void trace(String msg) {
        trace.trace(msg);
    }

    @Override
    public void trace(String msg, Throwable e) {
        trace.trace(msg, e);
    }

    @Override
    public void trace(String format, Object... argArray) {
        trace.trace(format, argArray);
    }

    @Override
    public void debug(String msg) {
        debug.debug(msg);
    }


    @Override
    public void debug(String msg, Throwable e) {
        debug.debug(msg, e);
    }


    @Override
    public void debug(String format, Object... argArray) {

    }

    @Override
    public void info(String msg) {
        info.info(msg);
    }


    @Override
    public void info(String msg, Throwable e) {
        info.info(msg, e);
    }


    @Override
    public void info(String format, Object... argArray) {
        info.info(format, argArray);
    }

    @Override
    public void warn(String msg) {
        warn.warn(msg);
    }


    @Override
    public void warn(String msg, Throwable e) {
        warn.warn(msg, e);
    }


    @Override
    public void warn(String format, Object... argArray) {
        warn.warn(format, argArray);
    }

    @Override
    public void error(String msg) {
        error.error(msg);
    }


    @Override
    public void error(String msg, Throwable e) {
        error.error(msg, e);
    }


    @Override
    public void error(String format, Object... argArray) {
        error.error(format, argArray);
    }


    @Override
    public boolean isTraceEnabled() {
        return trace.isTraceEnabled();
    }

    @Override
    public boolean isDebugEnabled() {
        return debug.isDebugEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
        return info.isInfoEnabled();
    }

    @Override
    public boolean isWarnEnabled() {
        return warn.isWarnEnabled();
    }

    @Override
    public boolean isErrorEnabled() {
        return error.isErrorEnabled();
    }
}
