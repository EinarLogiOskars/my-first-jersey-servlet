package com.einarlogi.my_first_jersey_servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/usertest")
public class getTest {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainUser() {
		return "Hello from Jersey";
	}

	@GET
	@Produces(MediaType.TEXT_HTML) 
	public String getHTMLUser() {

		return "<html>" + "<title>" + "User List" + "</title>" + "<body><h1>" + new resourcesTest().toString() + "</h1></body>" + "</html>";

	}

}
