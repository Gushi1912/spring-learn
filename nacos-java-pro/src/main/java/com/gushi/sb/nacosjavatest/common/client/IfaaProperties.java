package com.gushi.sb.nacosjavatest.common.client;

import lombok.Data;

/**
 * @author Gushi1912 | gushiyang@sheca.com
 * @version 0.0.1
 * 2021/11/17
 */
@Data
public class IfaaProperties {

    private String appCode;

    private String privateKey;

    private String esandPubKey;

    private String signType;
}
