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
	
	@Context
	private HttpServletRequest httpRequest;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response test(@QueryParam(value = "name") String name) {

		String output = name;

		System.out.println(name);

		return Response.status(200).entity(output).build();
	}



	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response newUser(String data) throws JSONException {

		String output = data.toString();
		
		JSONObject jObj = new JSONObject(output);
		
		UserDTO user = new UserDTO();
		
		//user.setUserId(Integer.parseInt(jObj.getString("userId")));
		user.setUserId(11); // this one can be deleted when the form is updated to let the user choose userId
		user.setUserName(jObj.getString("userName"));
		user.setCpr(jObj.getString("cpr"));
		user.setIni(jObj.getString("ini"));
		
		ArrayList<String> listdata = new ArrayList<String>();     
		JSONArray jArray = jObj.getJSONArray("roles"); 
		if (jArray != null) { 
		   for (int i=0;i<jArray.length();i++){ 
		    listdata.add(jArray.getString(i));
		   } 
		} 
		user.setRoles(listdata);
		try {
			us.createUser(user);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		Iterator<?> it = jObj.keys();
//		
//
//		while( it.hasNext() ) {
//			String key = (String)it.next();
//			System.out.println(jObj.getString(key));
//		}
//
//		System.out.println(output);

		return Response.status(200).entity(output).build(); 


	}

}
