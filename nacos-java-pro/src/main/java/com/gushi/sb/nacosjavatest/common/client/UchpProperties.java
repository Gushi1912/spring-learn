package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;

import java.util.Map;
import java.util.Objects;

/**
 * @program: cert-apply-front
 * @description: uchp系统配置
 * @author: WT.JIA
 * @create: 2021-11-15 15:43
 **/
@Data
public class UchpProperties {
    /**
     * ra编号
     */
    private String RANumber;
    /**
     * 私钥
     */
    private String priKey;
    /**
     * 个人证书 rsa
     */
    private String personRsaCertType;
    /**
     * 个人证书 sm2
     */
    private String personSm2CertType;
    /**
     * 企业证书  rsa
     */
    private String orgRsaCertType;
    /**
     * 企业证书 sm2
     */
    private String orgSm2CertType;
    /**
     * 证书
     */
    private String certChain;

    private Map<String, String> orgRsa;
    private Map<String, String> orgSm2;

    public String getOrgRsaCertType(String creditNumber) {
        if (Objects.isNull(orgRsa)) {
            return orgRsaCertType;
        }
        String sh = creditNumber.substring(2, 5);
        if(!Objects.equals("310",sh)){
            return orgRsaCertType;
        }
        String prefix = creditNumber.substring(0, 2);

        String s = orgRsa.get(prefix);

        //上海其他
        if(Objects.isNull(s)){
            s = orgRsa.get("Y1");
        }

        if (Objects.isNull(s)) {
            return orgRsaCertType;
        }
        return s;
    }

    public String getOrgSm2CertType(String creditNumber) {
        if (Objects.isNull(orgSm2)) {
            return orgSm2CertType;
        }
        String sh = creditNumber.substring(2, 5);
        //非上海的
        if(!Objects.equals("310",sh)){
            return orgSm2CertType;
        }
        //上海的
        String prefix = creditNumber.substring(0, 2);
        String s = orgSm2.get(prefix);
        //上海其他
        if(Objects.isNull(s)){
            s = orgSm2.get("Y1");
        }
        if (Objects.isNull(s)) {
            return orgSm2CertType;
        }
        return s;
    }
}
