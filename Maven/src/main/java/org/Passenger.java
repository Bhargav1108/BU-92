package org;

public class Passenger implements Comparable<Passenger>{
	
	private int id;

	public String Name;
	public int age;
	public String gender;
	
	public Passenger() {
		
	}
	public Passenger(int id, String name, int age, String gender) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.gender = gender;
	}
	

	public Passenger(String name, int age, String gender) {
		super();
		Name = name;
		this.age = age;
		this.gender = gender;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		this.Name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Passenger [Name=" + Name + ", age=" + age + ", gender=" + gender + "]";
	}


	public int compareTo(Passenger o) {
		return this.age - o.getAge();
	}

}
