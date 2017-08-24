package com.images.sex.entity;

import java.io.Serializable;

import com.images.sex.entity.enums.ImgStatus;

public class ImgViewer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nameVier;
	private String sourceAvata;
	private String description;
	private ImgStatus imgStatus;
	private String nameAvata;
	private String nameUUID;
	private ImgThumbnail thumbnai;
	private ImgLibrary library;
	private String dateCreate;
	private Double money;
	
	
	public ImgViewer() {
		super();
	}


	public ImgViewer(Integer id, String nameVier, String sourceAvata,
			String description, ImgStatus imgStatus, String nameAvata,
			String nameUUID, ImgThumbnail thumbnai, ImgLibrary library,
			String dateCreate, Double money) {
		super();
		this.id = id;
		this.nameVier = nameVier;
		this.sourceAvata = sourceAvata;
		this.description = description;
		this.imgStatus = imgStatus;
		this.nameAvata = nameAvata;
		this.nameUUID = nameUUID;
		this.thumbnai = thumbnai;
		this.library = library;
		this.dateCreate = dateCreate;
		this.money = money;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNameVier() {
		return nameVier;
	}


	public void setNameVier(String nameVier) {
		this.nameVier = nameVier;
	}


	public String getSourceAvata() {
		return sourceAvata;
	}


	public void setSourceAvata(String sourceAvata) {
		this.sourceAvata = sourceAvata;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public ImgStatus getImgStatus() {
		return imgStatus;
	}


	public void setImgStatus(ImgStatus imgStatus) {
		this.imgStatus = imgStatus;
	}


	public String getNameAvata() {
		return nameAvata;
	}


	public void setNameAvata(String nameAvata) {
		this.nameAvata = nameAvata;
	}


	public String getNameUUID() {
		return nameUUID;
	}


	public void setNameUUID(String nameUUID) {
		this.nameUUID = nameUUID;
	}


	public ImgThumbnail getThumbnai() {
		return thumbnai;
	}


	public void setThumbnai(ImgThumbnail thumbnai) {
		this.thumbnai = thumbnai;
	}


	public ImgLibrary getLibrary() {
		return library;
	}


	public void setLibrary(ImgLibrary library) {
		this.library = library;
	}


	public String getDateCreate() {
		return dateCreate;
	}


	public void setDateCreate(String dateCreate) {
		this.dateCreate = dateCreate;
	}


	public Double getMoney() {
		return money;
	}


	public void setMoney(Double money) {
		this.money = money;
	}

}
