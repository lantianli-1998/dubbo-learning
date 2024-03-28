package com.ltl.framework;

import java.io.Serializable;

public class URL implements Serializable {

    /**
     * 协议名.
     */
    private String protocol;

    /**
     * 服务ip.
     */
    private String hostname;

    /**
     * 服务端口.
     */
    private Integer port;

    /**
     * 服务接口.
     */
    private String interfaceName;

    /**
     * 服务具体实现类.
     */
    private Class<?> implClass;

    public URL(String protocol, String hostname, Integer port, String interfaceName, Class<?> implClass) {
        this.protocol = protocol;
        this.hostname = hostname;
        this.port = port;
        this.interfaceName = interfaceName;
        this.implClass = implClass;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHostname() {
        return hostname;
    }

    public Integer getPort() {
        return port;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public Class<?> getImplClass() {
        return implClass;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public void setImplClass(Class<?> implClass) {
        this.implClass = implClass;
    }
}
