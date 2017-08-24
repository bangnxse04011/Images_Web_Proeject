package com.images.sex.entity.enums;

public enum ImgStatus {
	
	ACTIVE("ACTIVE"), BLOCKED("BLOCKED");
	private String value;

	private ImgStatus(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}
}
