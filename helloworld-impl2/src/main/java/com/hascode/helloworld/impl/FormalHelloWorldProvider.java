package com.hascode.helloworld.impl;

import com.hascode.helloworld.api.HelloWorldProvider;

public class FormalHelloWorldProvider implements HelloWorldProvider {

	@Override
	public String helloWorld(final String userName) {
		return "Hello, " + userName;
	}

}
