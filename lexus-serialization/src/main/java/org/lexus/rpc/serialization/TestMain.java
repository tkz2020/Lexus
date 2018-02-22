package org.lexus.rpc.serialization;

import io.protostuff.LinkedBuffer;
import io.protostuff.Schema;
import io.protostuff.runtime.RuntimeSchema;
import org.lexus.rpc.serialization.hessian.Hessian2Serialization;
import org.lexus.rpc.serialization.java.JavaSerialization;
import org.lexus.rpc.serialization.protostuff.ProtoStuffSerialization;
import sun.awt.image.ImageWatched;

import java.io.Serializable;

/**
 * 测试序列化和反序列化
 */
public class TestMain {

    static class Student implements Serializable{
        private Integer stuId;
        private String stuName;
        private Integer stuAge;
        private String stuAddress;

        public Student() {
        }

        public Student(Integer stuId, String stuName, Integer stuAge, String stuAddress) {
            this.stuId = stuId;
            this.stuName = stuName;
            this.stuAge = stuAge;
            this.stuAddress = stuAddress;
        }

        public Integer getStuId() {
            return stuId;
        }

        public void setStuId(Integer stuId) {
            this.stuId = stuId;
        }

        public String getStuName() {
            return stuName;
        }

        public void setStuName(String stuName) {
            this.stuName = stuName;
        }

        public Integer getStuAge() {
            return stuAge;
        }

        public void setStuAge(Integer stuAge) {
            this.stuAge = stuAge;
        }

        public String getStuAddress() {
            return stuAddress;
        }

        public void setStuAddress(String stuAddress) {
            this.stuAddress = stuAddress;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "stuId=" + stuId +
                    ", stuName='" + stuName + '\'' +
                    ", stuAge=" + stuAge +
                    ", stuAddress='" + stuAddress + '\'' +
                    '}';
        }
    }


    private static void testHessian2Serialize(){
        Hessian2Serialization hessian = new Hessian2Serialization();
        // 序列化
        byte[] bytes = hessian.serialize(new Student(1001, "zhangsan", 27, "beijing"));

        // 反序列化
        Student student = hessian.deserialize(bytes, Student.class);

        System.out.println(student);
    }


    private static void testJavaSerialize(){
        JavaSerialization javaSerialization = new JavaSerialization();

        byte[] bytes = javaSerialization.serialize(new Student(1001, "zhangsan", 27, "beijing"));

        Student student = javaSerialization.deserialize(bytes, Student.class);

        System.out.println(student);
    }


    private static void testProtoStuffSerialize(){
        ProtoStuffSerialization protoStuffSerialization = new ProtoStuffSerialization();

        byte[] bytes = protoStuffSerialization.serialize(new Student(1001, "zhangsan", 27, "beijing"));

        Student student = protoStuffSerialization.deserialize(bytes, Student.class);

        System.out.println(student);
    }


    public static void main(String[] args) {
        //testJavaSerialize();

        testProtoStuffSerialize();
    }
}
