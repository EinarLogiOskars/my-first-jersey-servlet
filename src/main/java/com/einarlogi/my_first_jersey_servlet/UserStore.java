package com.einarlogi.my_first_jersey_servlet;

import java.util.ArrayList;
import java.util.List;


public class UserStore implements IUserDAO{
	
	MySQLAccess sql = new MySQLAccess();
	passwordGenerator pg = new passwordGenerator();
	
	ArrayList<UserDTO> userList = new ArrayList<UserDTO>();
	
	public UserStore() {
		
	}

	public UserDTO getUser(int userId) throws DALException {
		return null;
	}

	public List<UserDTO> getUserList() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}

	public void createUser(UserDTO user) throws DALException {
		user.setPassword(pg.createPassword());
		
		System.out.println(user.toString());
		
	}

	public void updateUser(UserDTO user) throws DALException {
		// TODO Auto-generated method stub
		
	}

	public void deleteUser(int userId) throws DALException {
		// TODO Auto-generated method stub
		
	}

}
