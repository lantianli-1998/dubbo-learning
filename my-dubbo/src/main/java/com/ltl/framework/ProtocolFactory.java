package com.ltl.framework;

import com.ltl.framework.protocol.dubbo.DubboProtocol;
import com.ltl.framework.protocol.http.HttpProtocol;

public class ProtocolFactory {
    public static Protocol getProtocol(String name) {

        switch (name) {
            case "http":
                return new HttpProtocol();
            case "dubbo":
                return new DubboProtocol();
            default:
                break;
        }

        return new HttpProtocol();
    }
}
