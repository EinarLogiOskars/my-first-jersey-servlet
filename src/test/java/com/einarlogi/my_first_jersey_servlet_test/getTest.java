package com.einarlogi.my_first_jersey_servlet_test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.einarlogi.my_first_jersey_servlet.resourcesTest;

@Path("/usertest")
public class getTest {
	
@GET
@Produces(MediaType.TEXT_HTML) 
public String getUser() {
	
	return "<html>" + "<title>" + "User List" + "</title>" + "<body><h1>" + new resourcesTest().toString() + "</h1></body>" + "</html>";
	
}
	
}
