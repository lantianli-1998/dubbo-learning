package com.ltl.framework.protocol.http;

import com.ltl.framework.Invocation;
import com.ltl.framework.Invoker;
import com.ltl.framework.URL;

public class HttpInvoker implements Invoker {

    private URL url;

    public HttpInvoker(URL url) {
        this.url = url;
    }

    @Override
    public String invoke(Invocation invocation) {
        HttpClient httpClient = new HttpClient();
        return httpClient.send(url.getHostname(), url.getPort(), invocation);
    }
}
