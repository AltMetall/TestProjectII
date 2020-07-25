/*
 * This is a simple JAVA File
 * 07/24/2020
 */
import java.util.Scanner;

public class JavaTest {
	public static int val(int x, int y) {
		//int z = 0;
		int z = x + y;
		return z;
	}

	public static void main(String[]args) {
	 Scanner sc = new Scanner(System.in);
	 int b = 2;
	 
	 System.out.println("Please enter a number: ");
	 int a = sc.nextInt();
	 
	 System.out.println(val(a,b));
 }
}
