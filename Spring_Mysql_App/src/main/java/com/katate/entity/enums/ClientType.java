package com.katate.entity.enums;

public enum ClientType {
	PERSON(0, "Person"),
	COMPANY(1, "Company");
	
	private int id;
	private String name;
	
	private ClientType(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public static ClientType toEnum(int id) {
		for (ClientType c : ClientType.values()) {
			if(id == c.getId()) {
				return c;
			}
		}
		throw new IllegalArgumentException();
	} 
}
