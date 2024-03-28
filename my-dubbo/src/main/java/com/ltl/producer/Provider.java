package com.ltl.producer;

import com.ltl.api.DemoService;
import com.ltl.framework.Protocol;
import com.ltl.framework.ProtocolFactory;
import com.ltl.framework.URL;
import com.ltl.producer.impl.DemoServiceImpl;

public class Provider {

    public static void main(String[] args) {
        String protocolName = System.getProperty("protocol");
        URL url = new URL(protocolName, "localhost", 8080, DemoService.class.getName(), DemoServiceImpl.class);
        Protocol protocol = ProtocolFactory.getProtocol(protocolName);
        protocol.export(url);
    }
}
