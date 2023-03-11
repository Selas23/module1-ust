package listdemo;

public class StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=12321;
		String str = i+"";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		Boolean result = str.equals(sb.toString());
		System.out.println(result);
		
		
	}

}
