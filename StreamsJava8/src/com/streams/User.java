package com.streams;

import java.util.List;

public class User {
	String name;
	int age=10;
	List<String> projId;
	

	public User(String name) {
		super();
		this.name = name;
	}
	
	public User(String name, int age, List<String> projId) {
		super();
		this.name = name;
		this.age = age;
		this.projId = projId;
	}

	public List<String> getProjId() {
		return projId;
	}

	public void setProjId(List<String> projId) {
		this.projId = projId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
