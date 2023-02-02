package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;

/**
 * @program: cert-apply-front
 * @description: 大家签配置
 * @author: WT.JIA
 * @create: 2021-11-18 17:22
 **/
@Data
public class DjqProperties {

    /**
     * 应用编号
     */
    private String openId;
    /**
     * 证书密码
     */
    private String password;
    /**
     * 证书文件名称
     */
    private String fileName;



}

