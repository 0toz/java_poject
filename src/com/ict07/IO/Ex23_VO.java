package com.ict07.IO;

import java.io.Serializable;

// Serializable{

public class Ex23_VO implements Serializable{
	private String name;
	private int age;
	transient private double weight;
	transient private boolean gender;
	
	
	public Ex23_VO() {
	}

	public Ex23_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
//얘네 받는 생성자. 프라이빗.이니까 ....>> 게터 세터.

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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
}
