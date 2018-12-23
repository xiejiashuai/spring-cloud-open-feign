package com.aihuishou.feign.springcloudfeign.app;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ITestService testService;

    public HelloController(ITestService testService) {
        this.testService = testService;
    }


    @GetMapping("/query")
    public String use() {

        User user = new User();
        user.setName("test");
        user.setAddress("aaaa");

        testService.query(user);

        return "success";

    }


}
