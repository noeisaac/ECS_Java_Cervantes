import java.util.Scanner;

public class Collatzsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		int number;
		
		System.out.println("Lets create a COLLAT SEQUENCE!");
		System.out.println("Rules:");
		System.out.println("If the number is even, divide it by 2.");
		System.out.println("If the number is odd, multiply by 3 and add 1");
		System.out.println("Repeat this decision until you reach 1");
		System.out.println("Starting number:");
		number = keyboard.nextInt();
		
		do
		{
			System.out.println((number / 2));
		} while ( number %2== 0 );
		do
		{
			System.out.println((number * 3) + 1);
		} while ( number %2!= 0);

	}

}
