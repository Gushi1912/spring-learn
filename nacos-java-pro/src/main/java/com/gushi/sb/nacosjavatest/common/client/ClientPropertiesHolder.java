package com.gushi.sb.nacosjavatest.common.client;


/**
 * @author xcl
 * @date 2022/1/21
 */
public class ClientPropertiesHolder {

    private static final ThreadLocal<ClientProperties> clientPropertiesThreadLocal = new InheritableThreadLocal<>();

    public static void setClientProperties(ClientProperties clientProperties) {
        clientPropertiesThreadLocal.set(clientProperties);
    }

    public static ClientProperties getClientProperties() {
        return clientPropertiesThreadLocal.get();
    }

    public static void clearClientProperties() {
        clientPropertiesThreadLocal.remove();
    }
}
