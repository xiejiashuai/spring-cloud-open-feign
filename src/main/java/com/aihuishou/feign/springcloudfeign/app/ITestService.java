package com.aihuishou.feign.springcloudfeign.app;

import com.aihuishou.feign.springcloudfeign.app.config.SpringQueryMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Map;

//@FeignClient(name = "server-demo")
// url + path url 前面可以没有http spring 会进行自动拼装 path会作为路径的一部分  path = "/test/" 为例 url+ path=http://locahost:port + /test
@FeignClient(name = "server-demo", url = "http://localhost:9090")
//@FeignClient(name = "server-demo",configuration = {TestFeignConfiguration.class},fallbackFactory = HystrixClientFallbackFactory.class)
public interface ITestService {

    @GetMapping("/test/{msg}")
    String test(@PathVariable("msg") String msg);

    @PostMapping("/user")
    User use(@RequestBody User user);

    @GetMapping("/query")
    String query(@SpringQueryMap User user);


//    @GetMapping("/query")
//    String query(User user);


}
