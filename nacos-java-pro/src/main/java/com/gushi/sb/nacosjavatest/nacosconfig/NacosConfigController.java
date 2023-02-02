package com.gushi.sb.nacosjavatest.nacosconfig;

import com.alibaba.fastjson.JSON;
import com.gushi.sb.nacosjavatest.common.client.ClientProperties;
import com.gushi.sb.nacosjavatest.common.client.DynamicClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2022/5/16 21:29
 */
@RestController
@RequestMapping("nacos")
public class NacosConfigController {

    @Autowired
    private DynamicClient dynamicClient;

    @GetMapping("config")
    public String getConfig() {
//        System.out.println(JSON.toJSONString(dynamicClient.getClientConfig("gscx")));
        ClientProperties gscx = dynamicClient.getClientConfig("gscx");
        return JSON.toJSONString(gscx);

    }
}
