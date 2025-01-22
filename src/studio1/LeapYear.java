package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("What is the year?");
		int n1 = in.nextInt();


		boolean divisible  =  (n1 % 4 == 0);
		boolean divisible2  =  (n1 % 100 != 0);
		boolean divisible3  =  (n1 % 400 == 0);

		
		System.out.println(n1 + " is a leap year: " +((divisible && divisible2) || divisible3));
		
		
		
	}

}
