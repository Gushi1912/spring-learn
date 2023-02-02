package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;

/**
 * @program: cert-apply-front
 * @description: 市民云oauth登录
 * @author: WT.JIA
 * @create: 2021-11-16 14:35
 **/
@Data
public class OauthProperties {
    /**
     * 应用key
     */
    private String appKey;
    /**
     * 应用秘钥
     */
    private String appSecret;
    /**
     * 回调地址
     */
    private String redirectUrl;

}
