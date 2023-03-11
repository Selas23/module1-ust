package oopsday1.setgetconstructors;

public class Car {
	
	// properties/data members/instance variables/attributes
	private String color;
	private double price;
	private String brand;
	private String model;
	
	
	public Car(String col, double price, String brand, String model) {
		
		this.color = color;// this. gives the global variable
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	@Override
	public String toString() {//when tostring() is called whatever in the object is printed
		return "I am a car "+brand;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}
