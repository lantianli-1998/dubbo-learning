package com.ltl.framework.protocol.http;

import com.ltl.framework.Invocation;
import com.ltl.framework.Invoker;
import com.ltl.framework.Protocol;
import com.ltl.framework.URL;
import com.ltl.framework.register.LocalRegister;
import com.ltl.framework.register.RemoteMapRegister;

public class HttpProtocol implements Protocol {

    @Override
    public void export(URL url) {
        // 本地注册
        LocalRegister.regist(url.getInterfaceName(), url.getImplClass());
        // 注册中心注册
        RemoteMapRegister.regist(url.getInterfaceName(), url);
        // 启动Tomcat
        new HttpServer().start(url.getHostname(), url.getPort());
    }

    @Override
    public Invoker refer(URL url) {
        return new HttpInvoker(url);
    }

}
