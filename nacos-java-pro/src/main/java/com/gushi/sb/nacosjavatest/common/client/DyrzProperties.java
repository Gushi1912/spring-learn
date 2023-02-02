package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;

/**
 * @program: cert-apply-front
 * @description: 多源认证配置
 * @author: WT.JIA
 * @create: 2021-11-15 15:48
 **/
@Data
public class DyrzProperties {
    /**
     * 应用编号
     */
    private String appid;
    /**
     * 应用秘钥
     */
    private String appSecret;

    private String corporAppid;

    private String corporAppSecret;

    /**
     * 个人认证
     */
    private String dyrzAuthUrl;
    /**
     * 多源认证企业认证
     */
    private String dyrzTrustUrl;
}
