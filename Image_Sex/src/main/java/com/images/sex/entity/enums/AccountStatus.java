package com.images.sex.entity.enums;

public enum AccountStatus {
	
	ACTIVE("ACTIVE"), BLOCKED("BLOCKED");
	private String value;

	private AccountStatus(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}
	
}
