package com.ltl.framework;

import java.io.Serializable;


public class Invocation implements Serializable {

    /**
     * 接口名.
     */
    private String interfaceName;

    /**
     * 方法名.
     */
    private String methodName;

    /**
     * 参数值列表.
     */
    private Object[] params;

    /**
     * 参数类型列表.
     */
    private Class<?>[] paramType;

    public Invocation(String interfaceName, String methodName, Object[] params, Class[] paramType) {
        this.interfaceName = interfaceName;
        this.methodName = methodName;
        this.params = params;
        this.paramType = paramType;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamType() {
        return paramType;
    }

    public void setParamType(Class[] paramType) {
        this.paramType = paramType;
    }
}
