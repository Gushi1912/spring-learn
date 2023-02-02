package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;

/**
 * @program: cert-apply-front
 * @description: openapi配置
 * @author: WT.JIA
 * @create: 2021-11-15 15:27
 **/
@Data
public class OpenAPiProperties {
    /**
     *
     */
    private String secret;
    /**
     * 上传证书存储路径前缀
     */
    private String certPathPrefix;
    /**
     * 短信key
     */
    private String smsKey;
    /**
     * 文件上传key
     */
    private String fileKey;
    /**
     * 订单key
     */
    private String orderKey;

    /**
     * 电照服务key
     */
    private String etlKey;

    /**
     * RA资料审核服务key
     */
    private String raAuditKey;


}
