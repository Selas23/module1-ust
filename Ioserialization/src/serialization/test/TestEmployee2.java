package serialization.test;

//import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
//import java.io.Serializable;

public class TestEmployee2 {

	public static void main(String[] args)  throws IOException, ClassNotFoundException {
	
	{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\ustcore\\Ioserialization\\emp.dat");
		ObjectInputStream ois= new ObjectInputStream(fis); //input stream to read
		Object obj = ois.readObject();
		Employee ref = (Employee) obj;
		System.out.println(ref);
		
	}

}
}
