package proj1;
import java.util.Scanner;
public class Classname {

	private static Scanner in;

	public static void main(String args[])
	   {
	      int x, y, z;
	      System.out.println("Enter two integers to calculate their sum ");
	      in = new Scanner(System.in);
	      x = in.nextInt();
	      y = in.nextInt();
	      z = x + y;
	      System.out.println("Sum of entered integers = "+z);
	   }
}
