package exceptionsday6;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program task begins");
		
		try {
			System.out.println("from try after exception");
			int c=10/0;
			
			System.out.println("from try after exception");
			
		}
		
		catch (Exception e) {
			
			System.out.println("from catch...");
			
		}
		
//		catch(ArithmeticException e) {
//			
//			//System.out.println();
//			e.printStackTrace();
//		}
//		
		finally {
			
			System.out.println("from finally...");
			
		}
		
		System.out.println("Program completed task");
	}

}
