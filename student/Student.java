package edu.monmouth.student;

public class Student {
	private int id;
	private int age;
	private String name;
	/**
	 * @param id
	 * @param age
	 * @param name
	 */
	public Student(int id, int age, String name) {
		setId(id);
		setAge(age);
		setName(name);
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "id=" + id + ", age=" + age + ", name=" + name;
	}
	
	
}
