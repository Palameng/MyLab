package com.mengyuan.mylab.controller;

import com.mengyuan.mylab.common.JsonResult;
import com.mengyuan.mylab.pojo.RedisTest;
import com.mengyuan.mylab.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/hello.do")
    public JsonResult hello(){
        String hello = "hello world!";
        List<RedisTest> redisTestList = userRepository.findByName("Meng");
        return JsonResult.ok(redisTestList);
    }

}
