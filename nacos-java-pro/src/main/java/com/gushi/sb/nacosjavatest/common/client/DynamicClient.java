package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * @author xcl
 * @date 2021/11/12
 */

@Configuration
@Data
@ConfigurationProperties(prefix = "client")
@RefreshScope
public class DynamicClient {

    /**
     * openapi地址
     */
    private String openApiUrl;
    /**
     * 订单系统地址
     */
    private String orderUrl;
    /**
     * 支付系统地址
     */
    private String payUrl;
    /**
     * 印章系统地址
     */
    private String sealUrl;
    /**
     * uchp系统地址
     */
    private String uchpUrl;
    /**
     * 多源认证获取token地址
     */
    private String dyrzAuthUrl;
    /**
     * 多源认证地址
     */
    private String dyrzTrustUrl;

    /**
     * 本地免密服务地址
     */
    private String ifaaUrl;

    /**
     * 市民云oauth登录地址
     */
    private String oauthUrl;

    /**
     * 大家签获取印模地址
     */
    private String djqUrl;

    /**
     * 微信开放平台地址
     */
    private String wxUrl;

    private Map<String, ClientProperties> config;

    public ClientProperties getClientConfig(String key) {
        return config.get(key);
    }
}
