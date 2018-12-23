//package com.aihuishou.feign.springcloudfeign.app;
//
//import feign.Logger;
//import org.springframework.cloud.openfeign.DefaultFeignLoggerFactory;
//import org.springframework.cloud.openfeign.FeignLoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
////  所有的 Feign client 的默认配置 存储在跟web 上下文中  当某个client 没有指定 configuration属性时 该client讲使用该配置
//@Configuration
//public class CustomFeignConfiguration {
//
//    //  会在web 上下文中
//    @Bean
//    Logger.Level feignLoggerLevel() {
//        return Logger.Level.NONE;
//    }
//
//
//    //  会在web 上下文中
//    @Bean
//    public FeignLoggerFactory feignLoggerFactory(Logger logger) {
//        return new DefaultFeignLoggerFactory(logger );
//    }
//
//    //  会在web 上下文中
//    @Bean
//    public Logger logger() {
//        return new Logger.JavaLogger();
//    }
//
//}
