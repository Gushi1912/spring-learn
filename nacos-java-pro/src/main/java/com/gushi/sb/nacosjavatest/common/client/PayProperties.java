package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;

/**
 * @program: cert-apply-front
 * @description: 支付配置
 * @author: WT.JIA
 * @create: 2021-11-15 15:37
 **/
@Data
public class PayProperties {
    /**
     * 微信回调地址
     */
    private String wxCallbackUrl;
    /**
     * 支付宝回调地址
     */
    private String alipayCallbackUrl;
    /**
     * appid
     */
    private Integer appid;
    /**
     * 秘钥
     */
    private String secret;
}
