package com.images.sex.entity.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;

import com.images.sex.entity.User;
import com.images.sex.entity.custom.UserCustom;
import com.images.sex.entity.db.MysqlDataSource;
import com.images.sex.entity.enums.AccountStatus;

public class UserImpl implements UserCustom, Serializable {

	/**
	 * 
	 */
	private static final long 			serialVersionUID = 1L;
	private static StringBuilder 		stringBuilder 	= null;
	private static Connection 			conn 			= null;
	private static PreparedStatement 	ps 				= null;
	private static ResultSet 			rs 				= null;
	private static List<User> 			listUser		= null;
	
	/**
	 * Method check login 
	 */
	public Boolean authAccount(String user, String pass) throws SQLException {
		boolean check = false;
		conn = MysqlDataSource.getInstance().getConnect();
		stringBuilder = new StringBuilder();
		stringBuilder.append("SELECT * FROM user WHERE acc_user = ? AND acc_pass = ?");
		ps = conn.prepareStatement(stringBuilder.toString());
		rs = ps.executeQuery();
		if(rs.next()) {
			check = true;
		}
		DbUtils.closeQuietly(conn, ps, rs);
		return check;
	}

	/**
	 * Method find all user
	 * @throws SQLException 
	 */
	public Iterable<User> findAll() throws SQLException {
		AccountStatus status;
		listUser = new ArrayList<User>();
		conn = MysqlDataSource.getInstance().getConnect();
		stringBuilder = new StringBuilder();
		stringBuilder.append("SELECT * FROM user");
		ps = conn.prepareStatement(stringBuilder.toString());
		rs = ps.executeQuery();
		while(rs.next()) {
			Integer id = rs.getInt(1);
			String user = rs.getString(2);
			String pass = rs.getString(3);
			String fName = rs.getString(4);
			String lName = rs.getString(5);
			String email = rs.getString(6);
			String phone = rs.getString(7);
			String address = rs.getString(8);
			Double money = rs.getDouble(9);
			String st = rs.getString(10);
			Date date = rs.getDate(11);
			if(st.equals("ACTIVE")) {
				status = AccountStatus.ACTIVE;
			} else {
				status = AccountStatus.BLOCKED;
			}
			listUser.add(new User(id, user, pass, fName, lName, email, phone, address, money, status, date));
		}
		return listUser;
	}

}
