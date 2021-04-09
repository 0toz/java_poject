package com.ict07.IO;

import java.io.Serializable;

public class Ex26_VO implements Serializable {

	private String name;
	private int age;
	private int weight;
	private boolean gender;
	
public Ex26_VO() {
}

public Ex26_VO(String name, int age, int weight, boolean gender) {
	super();
	this.name = name;
	this.age = age;
	this.weight = weight;
	this.gender = gender;
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

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public boolean isGender() {
	return gender;
}

public void setGender(boolean gender) {
	this.gender = gender;
}	
	
	
	
	
	
	
	
	
	
	
	
	
}
