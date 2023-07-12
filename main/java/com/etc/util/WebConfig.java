package com.etc.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author yyt
 * @version 1.0
 * @project spring-boot
 * @date 2022/9/30 10:03:24
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/img/*").addResourceLocations("file:D:\\img\\");
    }
}
