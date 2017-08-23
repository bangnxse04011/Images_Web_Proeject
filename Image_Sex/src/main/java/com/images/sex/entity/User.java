package com.images.sex.entity;

import java.io.Serializable;
import java.sql.Date;

import com.images.sex.entity.enums.AccountStatus;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private 	Integer 		id;
	private 	String 			user;
	private 	String 			pass;
	private 	String 			fName;
	private 	String 			lName;
	private 	String 			email;
	private 	String 			phone;
	private 	String 			address;
	private 	Double 			money;
	private 	AccountStatus 	status;
	private		Date			dateCreate;
	
	public User() {
		super();
	}

	public User(Integer id, String user, String pass, String fName,
			String lName, String email, String phone, String address,
			Double money, AccountStatus status, Date dateCreate) {
		super();
		this.id = id;
		this.user = user;
		this.pass = pass;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.money = money;
		this.status = status;
		this.dateCreate = dateCreate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public Date getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
