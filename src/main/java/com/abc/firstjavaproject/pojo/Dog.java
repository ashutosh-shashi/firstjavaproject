package com.abc.firstjavaproject.pojo;

public class Dog extends Animal implements Ianimal{

	private String name;
	private String color;
	
	public static int height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void makeSound() {
		System.out.println("Bark");
		
	}
	
	
}
