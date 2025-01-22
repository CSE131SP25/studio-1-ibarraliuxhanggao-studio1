package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();

		boolean is0rdered =  x < y;
		boolean is0rdered2 =  y < z;
		System.out.print("the statement x<y<z is: " +(is0rdered && is0rdered2));
		
		boolean is0rdered3 =  x > y;
		boolean is0rdered4 =  y > z;
		System.out.println(" and the statement x>y>z is: " +(is0rdered3 && is0rdered4));
		
		System.out.println(true || true);
	}
}
