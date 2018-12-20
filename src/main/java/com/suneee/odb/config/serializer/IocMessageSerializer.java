package com.suneee.odb.config.serializer;

/**
 * 消息序列化反序列化接口
 * @ClassName: IocMessageSerializer
 * @Author: ChenBo
 * @DateTime: 2018/10/29:10:07
 */
public interface IocMessageSerializer {
    
    /**
     * 设置序列化对象
     * @Author:ChenBo
     * @DateTime:2018/10/29:10:12
     */
    void registerClass ();


    /**
     *  将对象转换成二进制流
     * @Author:ChenBo
     * @DateTime:2018/10/29:10:12
     */
    byte[] toBytes(Object message);

    /**
     * 将二进制流转换成制定对象
     * @Author:ChenBo
     * @DateTime:2018/10/29:10:13
     */
    <T> T fromBytes(byte[] bytes, Class<T> clazz);
}
