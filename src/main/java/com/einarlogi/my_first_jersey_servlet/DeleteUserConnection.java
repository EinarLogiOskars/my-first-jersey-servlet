package com.einarlogi.my_first_jersey_servlet;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/deleteuser")
public class DeleteUserConnection {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response newUser(String data) throws JSONException {

		String output = data.toString();
		
		int id = Integer.parseInt(output); 
		//TODO pull user from database based on ID
		
		UserDTO User1 = new UserDTO();
		User1.setCpr("010101-0101");
		User1.setIni("DICK");
		User1.setUserId(69);
		User1.setUserName("Niklas");
		User1.addRole("Admin");
		
		
		JSONObject jObj = new JSONObject(output);
		String roles = jObj.getString("roles");
		//System.out.println(roles);

		UserDTO user = new UserDTO();
		return null;

	}
}