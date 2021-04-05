package com.ict03.class01;

public class Ex12 {


	private String name ="µÑ¸®";
	private int age = 24;
	private boolean gender = true;

	public Ex12() {
		// TODO Auto-generated constructor stub
	}

	public Ex12 (String name , int age) {
		System.out.println(1);
		this.name = name;
		this.age = age;
	}
	public Ex12 ( int age, String name ) {
		System.out.println(2);
		this.name = name;
		this.age = age;
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


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
}
