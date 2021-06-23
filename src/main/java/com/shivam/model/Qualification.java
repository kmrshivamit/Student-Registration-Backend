package com.shivam.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Qualification {
	@Id
	long id;
    @NotNull
	String name;
	public Qualification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Qualification(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
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

