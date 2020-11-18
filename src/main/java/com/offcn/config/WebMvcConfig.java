package com.offcn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //将所有D:\\springboot\\pic\\ 访问都映射到/myPic/** 路径下
        registry.addResourceHandler("/myPic/**").addResourceLocations("file:E:\\2020Java学习\\第三阶段Java高级框架\\文件上传\\");
    }
}
