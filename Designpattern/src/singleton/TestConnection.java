package singleton;

public class TestConnection {

	public static void main(String[] args) {
		
		//Math math = new Math();
		
		for(int i=1;i<=10;i++) {
		
		Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
			
			
		
		
//		System.out.println(con1);
//		System.out.println(con2);
		
		if(con1.hashCode() == con2.hashCode()) 
			System.out.println("Connection is singleton");
			
		else
			System.out.println("Connection is not singleton");
				
		}
	}
	
}
