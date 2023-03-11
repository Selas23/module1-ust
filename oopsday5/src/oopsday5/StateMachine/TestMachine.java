package oopsday5.StateMachine;

import java.util.Scanner;

public class TestMachine {

	public static void main(String[] args) {
		
		StateFunction sf = new StateFunction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int amount = sc.nextInt();
		int ch = 1;
		int j=1;
		
		do {
			
			switch(ch) {
			
			case 1 : {
				System.out.println("enter the no. of. 100 denominations");
				int c100 = sc.nextInt();
				sf.withdraw100(amount, c100);
				if(amount == sf.note)
					break;
			}
			
			case 2 : {
				System.out.println("enter the no. of. 50 denominations");
				int c50 = sc.nextInt();
				sf.withdraw50(amount, c50);
				if(amount == sf.note)
					break;
			}
			
			case 3 : {
				System.out.println("enter the no. of. 20 denominations");
				int c20 = sc.nextInt();
				sf.withdraw20(amount, c20);
				if(amount == sf.note)
					break;
			}
			
			case 4 : {
				System.out.println("enter the no. of. 10 denominations");
				int c10 = sc.nextInt();
				sf.withdraw10(amount, c10);
				if(amount == sf.note)
					break;
			}
			
			case 5 : {
				System.out.println("enter the no. of. 5 denominations");
				int c5 = sc.nextInt();
				sf.withdraw5(amount, c5);
				if(amount == sf.note)
					break;
			}
			default : {
				
				System.out.println("Wrong input");
				System.out.println("Enter again");
				j++;
			}
			
			} 
		
		}while((j<3) & (amount!= sf.note));		
		
	}

}
//		System.out.println("Denominations of 100");
//		int a100 = sc.nextInt();
//		System.out.println("Denominations of 50");
//		int a50 = sc.nextInt();
//		System.out.println("Denominations of 20");
//		int a20 = sc.nextInt();
//		System.out.println("Denominations of 10");
//		int a10 = sc.nextInt();
//		System.out.println("Denominations of 5");
//		int a5 = sc.nextInt();
