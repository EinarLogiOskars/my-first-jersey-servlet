package com.einarlogi.my_first_jersey_servlet;

import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.einarlogi.my_first_jersey_servlet.IUserDAO.DALException;




@Path("/createuser")
public class CreateUserConnection {

	UserStore us = new UserStore();


	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response newUser(String data) throws JSONException {

		String output = data.toString();
		//System.out.println(output);
		
		JSONObject jObj = new JSONObject(output);
		String roles = jObj.getString("roles");
		//System.out.println(roles);
		
		UserDTO user = new UserDTO();
		
		//user.setUserId(Integer.parseInt(jObj.getString("userId")));
		user.setUserId(11); // this one can be deleted when the form is updated to let the user choose userId
		user.setUserName(jObj.getString("userName"));
		user.setCpr(jObj.getString("cpr"));
		user.setIni(jObj.getString("ini"));
		ArrayList<String> listdata = new ArrayList<String>();     
		if (roles.contains("Admin"))
			listdata.add("Admin");
		if (roles.contains("Operator"))
			listdata.add("Operator");
		if (roles.contains("Foreman"))
			listdata.add("Foreman");
		if (roles.contains("Pharmacist"))
			listdata.add("Pharmacist");
		
		user.setRoles(listdata);
		try {
			us.createUser(user);
			
		//TODO add to database missing!!
			
		} catch (DALException e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(output).build(); 

	}

}
