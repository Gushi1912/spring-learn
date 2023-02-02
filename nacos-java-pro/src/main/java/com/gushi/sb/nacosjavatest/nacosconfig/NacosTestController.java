package com.gushi.sb.nacosjavatest.nacosconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2022/5/16 16:34
 */
@RequestMapping("nacos")
@RestController
@RefreshScope
public class NacosTestController {

    @Value("${test.value}")
    private String value;

    @GetMapping("/hello")
    public String helloNacos() {
        return "hello " + value;
    }
}
