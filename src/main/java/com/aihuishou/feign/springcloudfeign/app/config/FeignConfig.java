package com.aihuishou.feign.springcloudfeign.app.config;

import org.springframework.cloud.openfeign.annotation.PathVariableParameterProcessor;
import org.springframework.cloud.openfeign.annotation.RequestHeaderParameterProcessor;
import org.springframework.cloud.openfeign.annotation.RequestParamParameterProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

//    @Bean
//    public QueryMapParameterProcessor queryMapParameterProcessor() {
//        return new QueryMapParameterProcessor();
//    }
//
//    @Bean
//    public RequestHeaderParameterProcessor requestHeaderParameterProcessor() {
//        return new RequestHeaderParameterProcessor();
//    }
//
//    @Bean
//    public PathVariableParameterProcessor pathVariableParameterProcessor() {
//        return new PathVariableParameterProcessor();
//    }
//
//    @Bean
//    public RequestParamParameterProcessor requestParamParameterProcessor() {
//        return new RequestParamParameterProcessor();
//    }

    @Bean
    public CustomizerSpringMvcContract customizerSpringMvcContract() {
        return new CustomizerSpringMvcContract();
    }

}
