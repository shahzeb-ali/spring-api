package com.shahzeb.students;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Students {
	@Id
	private static Integer id = 0;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "classname")
	private String classname;

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
		this.classname = className;
		Students.id++;
	}

	public Students() {

	}

	/**
	 * @param name the name to set
	 */
//	public void setName(String name) {
//		this.name = name;
//	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

//	/**
//	 * @param age the age to set
//	 */
//	public void setAge(int age) {
//		this.age = age;
//	}
	/**
	 * @return the className
	 */
	public String getClassName() {
		return classname;
	}

//	/**
//	 * @param className the className to set
//	 */
//	public void setClassName(String className) {
//		this.className = className;
//	}
	public long getId() {
		return id;
	}

//	public void setId(Integer id) {
//		Students.id = id;
//	}

}
