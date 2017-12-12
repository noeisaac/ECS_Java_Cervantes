import java.util.Random;
import java.util.Scanner;

public class HiLow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int guess, number = 1 + r.nextInt(100);
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it");
		guess = keyboard.nextInt();
		
		if ( number > guess )
		{
			System.out.println("Sorry, you are too low, I was thinking of " + number + ".");
		}
		else if ( number < guess )
		{
			System.out.println("Sorry, you are too high. I was thinking of " + number + ".");
		}
		else if ( number == guess )
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		

	}

}
