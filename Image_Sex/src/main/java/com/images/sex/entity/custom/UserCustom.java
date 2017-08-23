package com.images.sex.entity.custom;

import java.sql.SQLException;

import com.images.sex.entity.User;


public interface UserCustom {

	/**
	 * Method check login when use login to system
	 * 
	 * @param user : user name
	 * @param pass : password
	 * @return : true if user and pass in data
	 * @throws SQLException 
	 */
	public Boolean authAccount(String user, String pass) throws SQLException;
	
	/**
	 * Method findAll user form database
	 * 
	 * @return : list data
	 * @throws SQLException 
	 */
	public Iterable<User> findAll() throws SQLException;
}
