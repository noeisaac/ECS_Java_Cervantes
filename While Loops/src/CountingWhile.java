import java.util.Scanner;

public class CountingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Type in a new message and I'll display it five times.");
		System.out.println("Message: ");
		String message = keyboard.nextLine();
		
		int n = 0;
		while ( n < 5 )
		{
			System.out.println( (n+1) + ". " + message );
			n++;
		}

	}

}
