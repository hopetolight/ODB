package com.suneee.odb.config.serializer;

import com.suneee.odb.config.serializer.impl.KryoSerializer;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @
 * @ClassName: SerializerConfiguration
 * @Author: ChenBo
 * @DateTime: 2018/12/18:11:37
 */
@SpringBootConfiguration
public class SerializerConfiguration {
    @Bean(initMethod = "registerClass")
    public KryoSerializer kryoSerializer(){
        return KryoSerializer.getInstance ();
    }
}
