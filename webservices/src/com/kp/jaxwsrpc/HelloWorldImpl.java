package com.kp.jaxwsrpc;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.kp.jaxwsrpc.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}