package com.kp.jaxwsdocument;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.kp.jaxwsdocument.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}