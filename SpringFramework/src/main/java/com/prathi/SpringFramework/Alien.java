package com.prathi.SpringFramework;

public class Alien 
{
	private int age;
//	private Laptop laptop;
	private Computer com;
	//default constructor
	/*
	 * public Alien() { System.out.println("Alien object created.."); }
	 */
	
	//paramaterized constructor
		
	/*
	 * public Alien(int age, Laptop laptop) { this.age = age; this.laptop = laptop;
	 * }
	 */

	//getters and setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("Age assigned..");
	}
	
	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}
	
	/*
	 * public Laptop getLaptop() { return laptop; } public void setLaptop(Laptop
	 * laptop) { this.laptop = laptop; System.out.println(
	 * "laptop value assigned..."); }
	 */
	
	
	//instance method
	public void code()
	{
		System.out.println("im coding...");
	//	laptop.compile();
		com.compile();
	}
}
