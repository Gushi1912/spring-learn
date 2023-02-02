package com.gushi.sb.nacosjavatest.common.client;


import lombok.Data;

/**
 * @author xcl
 * @date 2021/11/12
 */
@Data
public class ClientProperties {

    /**
     * openapi配置
     */
    private OpenAPiProperties openapi;
    /**
     * 短信配置
     */
    private SmsProperties sms;

    /**
     * 支付配置
     */
    private PayProperties pay;
    /**
     * 印章配置
     */
    private SealProperties seal;
    /**
     * uchp配置
     */
    private UchpProperties uchp;
    /**
     * 多源认证配置
     */
    private DyrzProperties dyrz;
    /**
     * 市民云oauth登录配置
     */
    private OauthProperties oauth;

    /**
     * ifaa配置
     */
    private IfaaProperties ifaa;

    /**
     * 大家签配置
     */
    private DjqProperties djq;

    /**
     * 变更证书配置商品id
     */
    private ModifyProperties modify;

    /**
     * 微信配置
     */
    private WxProperties wx;

}
