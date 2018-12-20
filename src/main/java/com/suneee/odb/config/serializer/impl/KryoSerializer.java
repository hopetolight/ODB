package com.suneee.odb.config.serializer.impl;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.suneee.odb.config.serializer.IocMessageSerializer;
import com.suneee.odb.config.serializer.constant.Constants;
import org.objenesis.strategy.StdInstantiatorStrategy;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @ 基于Kryo实现对象的序列化和反序列化
 *
 * @ wjf
 * @ 2016-07-13
 */
public class KryoSerializer implements IocMessageSerializer
{
    private ThreadLocal<Kryo> serializeThreadLocal = new ThreadLocal<Kryo>();

    private static KryoSerializer instance = new KryoSerializer();

    private List<Class> clazzs = null;

    private KryoSerializer() {
    }

    public static KryoSerializer getInstance() {
        return instance;
    }

    public Kryo getSerializer() {
        Kryo kryo = serializeThreadLocal.get();

        if (kryo == null) {
            kryo = new Kryo();
            kryo.setRegistrationRequired(true);
            kryo.setReferences(true);
            kryo.setInstantiatorStrategy(new StdInstantiatorStrategy());

            kryo.register(Class.class);
            if(clazzs!=null){
                Iterator<Class> it = clazzs.iterator();
                while(it.hasNext()){
                    Class clazz = it.next();
                    kryo.register(clazz);
                }
            }

            serializeThreadLocal.set(kryo);
        }
        return kryo;
    }

    @Override
    public void registerClass() {
        this.clazzs = new ArrayList<Class>();
        clazzs.add(String.class);
        clazzs.add(Float.class);
        clazzs.add(Date.class);
        clazzs.add(Boolean.class);
        clazzs.add(Integer.class);
        clazzs.add(ArrayList.class);
        clazzs.addAll(Constants.serializeMap.values());

    }

    @Override
    public byte[] toBytes(Object message) {
        Kryo converter = getSerializer();
        Output output = new Output(1024, 30 * 1024);
        converter.writeObject(output, message);

        return output.toBytes();
    }

    @Override
    public <T> T fromBytes(byte[] bytes, Class<T> clazz) {
        Kryo converter = getSerializer();
        Input input = new Input(bytes);
        return converter.readObject(input, clazz);
    }

}