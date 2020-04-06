package com.shahzeb.APIstarter.HelloWorld.students;

public class Students {
	
	private String name;
	private int age;
	private String className;
	/**
	 * @return the name
	 */

	public String getName() {
		return name;
	}
	public Students(String name, int age, String className) {
		super();
		this.name = name;
		this.age = age;
		this.className = className;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}
	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}
	
	
	

}
