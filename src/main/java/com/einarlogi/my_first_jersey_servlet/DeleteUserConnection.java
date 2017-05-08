package com.einarlogi.my_first_jersey_servlet;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.catalina.User;
import org.json.JSONException;
import org.json.JSONObject;

@Path("/deleteuser")
public class DeleteUserConnection {

	MySQLAccess db = new MySQLAccess();
	
	@GET
	@Produces (MediaType.APPLICATION_JSON)
	public String getUser(){
		db.deleteUser(/*data*/);
		
		return null /* message to server saying its created. Status? */;
		
	}

}
