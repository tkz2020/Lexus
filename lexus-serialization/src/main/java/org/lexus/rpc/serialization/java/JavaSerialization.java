package org.lexus.rpc.serialization.java;

import org.lexus.rpc.common.utils.LoggerUtil;
import org.lexus.rpc.serialization.api.Serialization;

import java.io.*;

/**
 * Java实现序列化&&反序列化
 * @author tukangzheng
 *
 */
public class JavaSerialization extends Serialization{

    @Override
    public <T> byte[] serialize(T obj) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream output = null;
        try {
            output = new ObjectOutputStream(bos);
            output.writeObject(obj);
            output.flush();
            return bos.toByteArray();
        } catch (IOException e) {
            LoggerUtil.error("java serialize exception :{}", e);
        }
        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clz) {
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new ByteArrayInputStream(data));
            Object obj = input.readObject();
            return clz.cast(obj);
        } catch (Exception e) {
            LoggerUtil.error("java deserialize exception :{}", e);
        }
        return null;
    }
}
