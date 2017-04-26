package com.einarlogi.my_first_jersey_servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class MyJerseyPage {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHtmlHello() {
		return "Hello from Jersey";
	}

}
