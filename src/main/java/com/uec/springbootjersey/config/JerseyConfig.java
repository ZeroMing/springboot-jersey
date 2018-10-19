package com.uec.springbootjersey.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.SpringComponentProvider;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.springframework.context.annotation.Configuration;

/**
 * @description: Jersey配置类
 * @author: Ming.Lee/李明
 * @create: 2018-10-19 19:24
 **/
@Configuration
public class JerseyConfig extends ResourceConfig {


    public JerseyConfig() {
        register(RequestContextFilter.class);
        //配置restful package.
        packages("com.uec.resource");
        register(JacksonFeature.class);
        register(SpringComponentProvider.class);
    }

}