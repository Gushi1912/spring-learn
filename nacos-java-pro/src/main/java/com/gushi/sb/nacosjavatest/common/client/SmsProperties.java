package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;

/**
 * @program: cert-apply-front
 * @description: sms短信配置
 * @author: WT.JIA
 * @create: 2021-11-15 15:36
 **/
@Data
public class SmsProperties {
    /**
     * 登录验证码模板id
     */
    private String smsLoginTemplate;
    /**
     * 密码重置模板
     */
    private String pwdResetTemplate;
    /**
     * 证书授权模板
     */
    private String certGrantTemplate;
    /**
     * app下载地址
     */
    private String appDownUrl;
}
