package oopsday2_shapes;

public class RectangleFactory {
	
	public static void main(String [] args) {
		
		ShapeIface shape = new Rectangle (50,30);
		shape.area();
	}

}
