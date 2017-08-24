package com.images.sex.entity;

import java.io.Serializable;

public class ImgThumbnai implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String realName;
	
	public ImgThumbnai() {
		super();
	}

	public ImgThumbnai(Integer id, String name, String realName) {
		super();
		this.id = id;
		this.name = name;
		this.realName = realName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
