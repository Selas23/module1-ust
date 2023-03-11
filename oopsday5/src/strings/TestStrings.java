package strings;

public class TestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		
		byte bytes[] = {65,66,67,68,69};//bytes network communication other is for human communication
		String str = new String(bytes);
		System.out.println(str.length());
		System.out.println(str);
		str = "Welcome to UST Global";
		bytes = str.getBytes();
		for(byte b: bytes) {
			System.out.println(b);
		}
		
		char chars[] = {'U','S','T',' ','G'};
		
		str = new String (chars);
		System.out.println(str);
		
		str.getChars(0, chars.length-1, chars, 0);
		for(char c: chars) {
			System.out.println(c);
		}
		String string = new String("She sells sea. shells on the sea shore");
		int i=0;
		int c = string.charAt(i);
		for(i=0; i< string.length();i++) {
		
		if( c == 's' | c == 'S'){
			count++;
		}
		
		}System.out.println(count);
		
		String words[] = string.split("[.] ");
		System.out.println(words.length);
		
		for(String word: words) {
			System.out.println(word);
		}
		string = new String ("Cartoon");
		System.out.println(string.startsWith("Car"));
		System.out.println(string.endsWith("toon"));
		
		int apos = string.indexOf('a');
		int tpos = string.indexOf('t');
		
		String string2 = string.substring(apos,tpos+1); //starts at a goes till the next letter of r as tpos is incremented
		
		System.out.println(string2);
		
		string2 = string.substring(tpos);// starts at t goes until end of string
				
		
		System.out.println(string2);
		
		string = new String ("madamdam");
		int mpos = -1;
		int dpos = string.lastIndexOf('d');
		System.out.println(dpos);
		string2 = string.substring(dpos,string.length());
		System.out.println(string2);
		
		String email = new String ("selas.pbiju@ust.com");
		//int mpos = -1;
		int dpo = email.lastIndexOf('c');
		System.out.println(dpo);
		String email2 = email.substring(dpo,email.length());
		System.out.println(email2);
		
		String str1 = new String ("welcome");
		
		String str2 = new String ("welcome");
		
		boolean result = str1.equalsIgnoreCase(str2);
		System.out.println(result);

		int val = str2.compareTo(str1);// gives the difference of the ascii values of the first encountered different letters
		System.out.println(val);
		
		string = "Diehard";// String buffers support mutable strings. Because String objects are immutable they can be shared.
		// string does not support reversing
		System.out.println(string.toLowerCase());
		System.out.println(string);
		
		System.out.println(string.toUpperCase());
		System.out.println(string);
		// they are immutable
		
		//"16-11-477/6/A/3 hyderabad 500036"
		
		String str3 = "16-11-477//6/A/3 hyderabad 500036" ;
		
		int j=0, ctr1=0,ctr2=0,ctr3=0,ctr4=0;
		
		
		for(j=0; j< str3.length();j++) 
				
		{
			int ch = str3.charAt(j);
			
			if(Character.isDigit(ch)==true) 
				ctr1++;
			else if(Character.isAlphabetic(ch)==true)
				ctr2++;
			else if(Character.isSpaceChar(ch)==true)
				ctr3++;
			else 
				ctr4++;
			
		}
		System.out.println("no of digit is "+ctr1);
		System.out.println("no of alphabet is "+ctr2);
		System.out.println("no of spaces is "+ctr3);
		System.out.println("no of other characters "+ctr4);
	}

}
