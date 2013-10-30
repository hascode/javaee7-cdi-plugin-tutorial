package com.hascode.helloworld.impl;

import com.hascode.helloworld.api.HelloWorldProvider;

public class InformalHelloWorldProvider implements HelloWorldProvider {

	@Override
	public String helloWorld(final String userName) {
		return "Hey there, " + userName;
	}

}
