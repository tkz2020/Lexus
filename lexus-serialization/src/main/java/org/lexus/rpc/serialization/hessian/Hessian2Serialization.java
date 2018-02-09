package org.lexus.rpc.serialization.hessian;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;
import org.lexus.rpc.serialization.api.Serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author Administrator
 * hessian2的序列化方式
 */
public class Hessian2Serialization extends Serialization {

    @Override
    public <T> byte[] serialize(T obj) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Hessian2Output out = new Hessian2Output(bos);
        try {
            out.writeObject(obj);
            out.flush();
            return bos.toByteArray();
        } catch (IOException e){

        }
        return null;
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clz) {
        ByteArrayInputStream bin = new ByteArrayInputStream(data);
        Hessian2Input input = new Hessian2Input(bin);
        try {
            T object = (T) input.readObject(clz);
            return object;
        } catch (IOException e){

        }
        return null;
    }
}
