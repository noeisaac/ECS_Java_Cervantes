import java.util.Scanner;

public class EnterPin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;
		
		System.out.println("Welcome to the bank of Mitchel. ");
		System.out.println("Enter your pin:");
		int entry = keyboard.nextInt();
		
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.println("Enter your pin:");
			entry = keyboard.nextInt();
		}
		System.out.println("\nPIN ACCEPTED. YOUE NOWW HAVE ACCESS TO YOUR ACCOUNT.");

	}

}
