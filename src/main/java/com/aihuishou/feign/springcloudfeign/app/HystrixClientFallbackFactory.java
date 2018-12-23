//package com.aihuishou.feign.springcloudfeign.app;
//
//import feign.hystrix.FallbackFactory;
//import org.springframework.stereotype.Component;
//
//@Component
//public class HystrixClientFallbackFactory implements FallbackFactory<ITestService> {
//    @Override
//    public ITestService create(Throwable t) {
//
//        return (msg)->{
//
//            t.getStackTrace();
//
//            System.out.println(t.getMessage());
//
//            return "调用服务异常";
//
//        };
//    }
//}
