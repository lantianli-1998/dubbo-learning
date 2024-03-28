package com.ltl.framework.protocol.dubbo;

import com.ltl.framework.Invoker;
import com.ltl.framework.Protocol;
import com.ltl.framework.URL;
import com.ltl.framework.register.LocalRegister;
import com.ltl.framework.register.RemoteMapRegister;

public class DubboProtocol implements Protocol {

    @Override
    public void export(URL url) {
        LocalRegister.regist(url.getInterfaceName(), url.getImplClass());
        RemoteMapRegister.regist(url.getInterfaceName(), url);
        new NettyServer().start(url.getHostname(), url.getPort());
    }

    @Override
    public Invoker refer(URL url) {
        return new DubboInvoker(url);
    }

}
