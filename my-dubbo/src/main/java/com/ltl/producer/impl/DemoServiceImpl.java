package com.ltl.producer.impl;


import com.ltl.api.DemoService;

public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String userName) {
        return "Hello: " + userName;
    }
}
