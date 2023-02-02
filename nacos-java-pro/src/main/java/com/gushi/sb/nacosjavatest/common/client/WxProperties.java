package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;

/**
 * @program: cert-apply-front
 * @description: 微信配置
 * @author: WT.JIA
 * @create: 2021-12-20 16:01
 **/
@Data
public class WxProperties {

    /**
     * AppID(小程序ID)
     */
    private String appid;
    /**
     * 小程序密钥
     */
    private String appSecret;


}
