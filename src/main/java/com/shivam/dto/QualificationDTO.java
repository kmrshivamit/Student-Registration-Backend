package com.shivam.dto;

import javax.validation.constraints.NotNull;

public class QualificationDTO {
	
	long id;
	@NotNull
	String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
