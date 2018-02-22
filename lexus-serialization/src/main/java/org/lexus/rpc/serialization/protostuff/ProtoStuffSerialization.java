package org.lexus.rpc.serialization.protostuff;

import io.protostuff.LinkedBuffer;
import io.protostuff.ProtostuffIOUtil;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import org.lexus.rpc.common.utils.LoggerUtil;
import org.lexus.rpc.serialization.api.Serialization;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ProtoStuff的默认序列化和反序列化实现
 * @author Administrator
 */
public class ProtoStuffSerialization extends Serialization{

    private static Map<Class<?>, Schema<?>> cachedSchema = new ConcurrentHashMap<Class<?>, Schema<?>>();

    private static <T> Schema<T> getSchema(Class<T> claz){
        Schema<T> schema = (Schema<T>) cachedSchema.get(claz);
        if (schema == null){
            schema = RuntimeSchema.getSchema(claz);
            if (schema != null){
                cachedSchema.put(claz, schema);
            }
        }
        return schema;
    }


    @SuppressWarnings("unchecked")
    @Override
    public <T> byte[] serialize(T obj) {
        Class<T> claz = (Class<T>) obj.getClass();
        LinkedBuffer buffer = LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE);
        try {
            Schema<T> schema = getSchema(claz);
            return ProtostuffIOUtil.toByteArray(obj, schema, buffer);
        } catch (Exception e) {
            LoggerUtil.error("protostuff serialize exception :{}", e);
        } finally {
            buffer.clear();
        }
        return null;
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clz) {
        try {
            T obj = clz.newInstance();
            Schema<T> schema = getSchema(clz);
            ProtostuffIOUtil.mergeFrom(data, obj, schema);
            return obj;
        } catch (Exception e) {
            LoggerUtil.error("protostuff deserialize exception :{}", e);
        }
        return null;
    }
}
