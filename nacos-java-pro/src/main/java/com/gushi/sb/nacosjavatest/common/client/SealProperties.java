package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;

/**
 * @program: cert-apply-front
 * @description: 印章配置
 * @author: WT.JIA
 * @create: 2021-11-15 15:40
 **/
@Data
public class SealProperties {
    /**
     * 应用key
     */
    private String key;
    /**
     * 应用秘钥
     */
    private String secret;
}
