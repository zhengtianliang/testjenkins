package com.tsetjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: ZhengTianLiang
 * @date: 2021/03/07  14:41
 * @desc: 测试的controller
 */

@RestController
@RequestMapping("/jenkins")
public class TestController {

    /**
     * @author: ZhengTianLiang
     * @date: 2021/03/07  14:41
     * @desc: 测试的controller
     */
    @GetMapping("/test")
    public String test(){
        return "Hello boy";
    }
}
