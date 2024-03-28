package com.ltl.framework.protocol.dubbo;

import com.ltl.framework.Invocation;
import com.ltl.framework.Invoker;
import com.ltl.framework.URL;

public class DubboInvoker implements Invoker {

    private final URL url;

    public DubboInvoker(URL url) {
        this.url = url;
    }

    @Override
    public String invoke(Invocation invocation) {
        NettyClient nettyClient = new NettyClient();
        return nettyClient.send(url.getHostname(),url.getPort(), invocation);
    }

}
