package com.sustav.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.sustav.ws.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {
    @Override
    public String getHelloString(String name) {
        return "Hello " + name + "!";
    }
}
