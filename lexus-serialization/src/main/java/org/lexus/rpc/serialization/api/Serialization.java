package org.lexus.rpc.serialization.api;

/**
 * @author Administrator
 * 序列化接口
 */
public abstract class Serialization {

    /**
     * 序列化
     * @param obj
     * @param <T>
     * @return
     */
    public abstract <T> byte[] serialize(T obj);


    /**
     * 反序列化
     * @param <T>
     * @return
     */
    public abstract <T> T deserialize(byte[] data, Class<T> clz);
}
