package exceptionsday6;


public class ExceptionDemo2 { //args command line arguments

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program task begins");
		
		try {
		int a = Integer.parseInt(args [1]);//"10","20" //arrayIndexoubtofbox
		int b = Integer.parseInt(args [0]);//"10 "Ten"
		int c = b/a;
		
		String name = args[2];
		int data[] = {a,b};
		}
		catch (ArrayIndexOutOfBoundsException e ) {
			e.printStackTrace();
		}
		catch (NumberFormatException e){
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("Program task ends");
	}

}
