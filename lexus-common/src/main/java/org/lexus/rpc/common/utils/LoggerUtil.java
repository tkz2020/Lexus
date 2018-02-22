package org.lexus.rpc.common.utils;

import org.lexus.rpc.common.logger.DefaultLogService;
import org.lexus.rpc.common.logger.LoggerService;

/**
 * @author tukangzheng
 *
 */
public class LoggerUtil {

    private static LoggerService loggerService = new DefaultLogService();

    public static boolean isTraceEnabled() {
        return loggerService.isTraceEnabled();
    }

    public static boolean isDebugEnabled() {
        return loggerService.isDebugEnabled();
    }

    public static boolean isWarnEnabled() {
        return loggerService.isWarnEnabled();
    }

    public static boolean isErrorEnabled() {
        return loggerService.isErrorEnabled();
    }

    public static void trace(String msg) {
        loggerService.trace(msg);
    }

    public static void debug(String msg) {
        loggerService.debug(msg);
    }

    public static void debug(String format, Object... argArray) {
        loggerService.debug(format, argArray);
    }

    public static void debug(String msg, Throwable t) {
        loggerService.debug(msg, t);
    }

    public static void info(String msg) {
        loggerService.info(msg);
    }

    public static void info(String format, Object... argArray) {
        loggerService.info(format, argArray);
    }

    public static void info(String msg, Throwable t) {
        loggerService.info(msg, t);
    }

    public static void warn(String msg) {
        loggerService.warn(msg);
    }

    public static void warn(String format, Object... argArray) {
        loggerService.warn(format, argArray);
    }

    public static void warn(String msg, Throwable t) {
        loggerService.warn(msg, t);
    }

    public static void error(String msg) {
        loggerService.error(msg);
    }

    public static void error(String format, Object... argArray) {
        loggerService.error(format, argArray);
    }

    public static void error(String msg, Throwable t) {
        loggerService.error(msg, t);
    }
}
