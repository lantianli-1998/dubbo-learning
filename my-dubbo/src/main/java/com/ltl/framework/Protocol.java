package com.ltl.framework;

/**
 * 协议抽象接口.
 */
public interface Protocol {

    /**
     * 导出服务.
     *
     * @param url 服务URL
     */
    void export(URL url);

    /**
     * 引入服务.
     *
     * @param url 服务URL
     * @return 对于的服务执行器
     */
    Invoker refer(URL url);
}
