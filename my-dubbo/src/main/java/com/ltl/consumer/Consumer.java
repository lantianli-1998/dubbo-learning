package com.ltl.consumer;

import com.ltl.api.DemoService;
import com.ltl.framework.ProxyFactory;

public class Consumer {

    public static void main(String[] args) {
        DemoService helloService = ProxyFactory.getProxy(DemoService.class);
        String result = helloService.sayHello("ltl");
        System.out.println(result);
    }
}
