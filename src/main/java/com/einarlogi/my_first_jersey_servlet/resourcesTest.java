package com.einarlogi.my_first_jersey_servlet;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public class resourcesTest {
	
	private String name, address, phone_nr;
	
	public resourcesTest() {
		this.address = "Trørødvej 24";
		this.name = "Niklas Thielemann";
		this.phone_nr =  "40271127";
	}

	@Override
	public String toString() {
		return "resourcesTest [name=" + name + ", address=" + address + ", phone_nr=" + phone_nr + "]";
	}
	
	
}
