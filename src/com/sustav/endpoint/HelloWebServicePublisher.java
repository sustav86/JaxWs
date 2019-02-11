package com.sustav.endpoint;

import com.sustav.ws.HelloWebServiceImpl;

import javax.xml.ws.Endpoint;

public class HelloWebServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1986/wss/hello", new HelloWebServiceImpl());
    }
}
