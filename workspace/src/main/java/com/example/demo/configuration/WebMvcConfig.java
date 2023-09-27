package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        /* '/js/**'로 호출하는 자원은 '/static/js/' 폴더 아래에서 찾는다. */
//        registry.addResourceHandler("/js/**").addResourceLocations("classpath:/resources/js/").setCachePeriod(60 * 60 * 24 * 365);
//        /* '/css/**'로 호출하는 자원은 '/static/css/' 폴더 아래에서 찾는다. */
//        registry.addResourceHandler("/css/**").addResourceLocations("classpath:/resources/css/").setCachePeriod(60 * 60 * 24 * 365);
//        /* '/img/**'로 호출하는 자원은 '/static/img/' 폴더 아래에서 찾는다. */
//        registry.addResourceHandler("/image/**").addResourceLocations("classpath:/resources/images/").setCachePeriod(60 * 60 * 24 * 365);
//        /* '/font/**'로 호출하는 자원은 '/static/font/' 폴더 아래에서 찾는다. */
//        registry.addResourceHandler("/font/**").addResourceLocations("classpath:/resources/font/").setCachePeriod(60 * 60 * 24 * 365);

    }

}
