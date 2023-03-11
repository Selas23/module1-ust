package oopsday2_shapes;

public class Rectangle implements ShapeIface {
	
	private double length;
	private double breadth;
	
	
	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	public double getBreadth() {
		return breadth;
	}


	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	
	
	
	public Rectangle(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}

	
	
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}


	@Override
	public void area() {
		
		// TODO Auto-generated method stub
		System.out.println(length*breadth);
	}

}
