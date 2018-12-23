//package com.aihuishou.feign.springcloudfeign.app;
//
//import com.netflix.hystrix.HystrixCommand;
//import com.netflix.hystrix.HystrixCommandGroupKey;
//import com.netflix.hystrix.HystrixCommandProperties;
//import com.netflix.hystrix.HystrixThreadPoolProperties;
//import feign.Feign;
//import feign.Logger;
//import feign.Target;
//import feign.hystrix.HystrixFeign;
//import feign.hystrix.SetterFactory;
//import feign.slf4j.Slf4jLogger;
//import org.springframework.cloud.openfeign.DefaultFeignLoggerFactory;
//import org.springframework.cloud.openfeign.FeignClientsConfiguration;
//import org.springframework.cloud.openfeign.FeignLoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Scope;
//
//import java.lang.reflect.Method;
//
//
///**
// * 不是全局配置  某个单独的Feign client 将会使用这个配置
// * 每个client都会创建一个AnnotationConfigApplicationContext上下文 时根web上下文的子上下文
// * 会覆盖全局配置{@link CustomFeignConfiguration}
// *
// * 每个feign client的 默认配置 位于 {@link FeignClientsConfiguration}
// */
//public class TestFeignConfiguration {
//
//    //  会在AnnotationConfigApplicationContext 上下文中
//    @Bean
//    Logger.Level feignLoggerLevel() {
//        return Logger.Level.FULL;
//    }
//
//    //  会在AnnotationConfigApplicationContext 上下文中
//    @Bean
//    public FeignLoggerFactory feignLoggerFactory(Logger logger) {
//        return new DefaultFeignLoggerFactory(logger);
//    }
//
//    @Bean
//    public Logger logger() {
//        return new Slf4jLogger();
//    }
//
//
//    /**
//     * 配置某个feign client 的熔断策略 不配置的话默认为{@link SetterFactory.Default}
//     *
//     * 配置代码为{@link org.springframework.cloud.openfeign.FeignClientsConfiguration.HystrixFeignConfiguration#feignHystrixBuilder()}
//     *
//     * @return
//     */
////    @Bean
////    @Scope("prototype")
////    public Feign.Builder feignHystrixBuilder() {
////        return HystrixFeign.builder().setterFactory(new SetterFactory() {
////            @Override
////            public HystrixCommand.Setter create(Target<?> target, Method method) {
////                String groupKey = target.name();
//////                String commandKey = Feign.configKey(target.type(), method);
////                return HystrixCommand.Setter
////                        .withGroupKey(HystrixCommandGroupKey.Factory.asKey(groupKey))
//////                        .andCommandKey()
//////                .andThreadPoolKey()
//////                .andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.defaultSetter().withCoreSize(10)) 配置线程池配置
////                        .andCommandPropertiesDefaults(
////                                HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(10000)// 超时配置
////                                );
////            }
////        });
////    }
//
//
//}
