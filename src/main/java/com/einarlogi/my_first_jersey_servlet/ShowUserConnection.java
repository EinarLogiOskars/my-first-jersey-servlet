package com.einarlogi.my_first_jersey_servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.catalina.User;

public class ShowUserConnection {

	MySQLAccess db = new MySQLAccess();
	
	@GET
	@Produces (MediaType.APPLICATION_JSON)
	public User getUser(){
		return db.
	}

}
