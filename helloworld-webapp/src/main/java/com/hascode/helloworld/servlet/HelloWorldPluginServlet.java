package com.hascode.helloworld.servlet;

import java.io.IOException;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hascode.helloworld.api.HelloWorldProvider;

@WebServlet(urlPatterns = "/helloworld")
public class HelloWorldPluginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	@Any
	private Instance<HelloWorldProvider> helloWorldProviders;

	@Override
	protected void doGet(final HttpServletRequest req,
			final HttpServletResponse resp) throws ServletException,
			IOException {
		String userName = "Bert";

		for (HelloWorldProvider provider : helloWorldProviders)
			resp.getWriter().append(provider.helloWorld(userName));
	}
}
