package oopsday4.statictest;

public class TestStaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StaticDemo d = new StaticDemo();
//		StaticDemo d1 = new StaticDemo();
//		d.a = 20;
//		System.out.println(d1.a);//if not static then 0 else 20
//		d1.a++;
//		System.out.println(d.a);//if not static then 20 else 21
		System.out.println(StaticDemo.a);// 0
		StaticDemo d = new StaticDemo();
		System.out.println(d.a); // 1
		StaticDemo d1 = new StaticDemo();
		System.out.println(d1.a); // 2
		StaticDemo d2 = new StaticDemo();
		System.out.println(d2.a); // 3
		System.out.println(StaticDemo.a);// 3
	}

}
