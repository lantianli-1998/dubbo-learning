package com.ltl.framework;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory<T> {

    @SuppressWarnings("unchecked")
    public static <T> T getProxy(final Class<T> interfaceClass) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[]{interfaceClass}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String mock = System.getProperty("mock");
                if (mock != null && mock.startsWith("return:")) {
                    return mock.replace("return:", "");
                }
                Invocation invocation = new Invocation(interfaceClass.getName(), method.getName(), args, method.getParameterTypes());
                Invoker invoker = ClusterInvoker.join(interfaceClass);
                return invoker.invoke(invocation);
            }
        });
    }

}
