package lsp;

public class LSPDemo {

	public void CalculateArea(Shape s) {
		System.out.println(s.getArea());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LSPDemo lsp = new LSPDemo();
		
		//instance of rectangle is passed
		
		lsp.CalculateArea(new Rectangle(1,4));
		
		//instance of square is passed
		
		lsp.CalculateArea(new Square(5));
		
	}

}
