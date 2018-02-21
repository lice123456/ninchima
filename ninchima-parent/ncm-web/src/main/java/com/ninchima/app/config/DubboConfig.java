package com.ninchima.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration  
@PropertySource(value= {"classpath:dubbo/dubbo.properties"},encoding="utf-8")  
@ImportResource({ "classpath:dubbo/*.xml" })  
public class DubboConfig {

}
