package oopsday1.setget;

public class Car {
	
	// properties/data members/instance variables/attributes
	private String color;
	private double price;
	private String brand;
	private String model;
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		color = color;
	}
	public double getPrice() {
		return this.price;
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
