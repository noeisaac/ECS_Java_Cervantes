import java.util.Random;
import java.util.Scanner;

public class HighLowLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int guess, number = 1 + r.nextInt(100);
		int tries = 0;
		int n = 1;
		
		System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
		System.out.println("First guess:" );
		tries++;
		guess = keyboard.nextInt();
		
		while ( guess != number && tries < 7 )
		{
			if ( number > guess )
			{
				System.out.println("Sorry, you are too low." );
				System.out.println("Guess # " + (n+1) +":" );
				n++;
				guess = keyboard.nextInt();
				tries++;
			}
			else if ( number < guess )
			{
				System.out.println("Sorry, you are too high." );
				System.out.println("Guess # " + (n+1) +":" );
				n++;
				guess = keyboard.nextInt();
				tries++;
			}
			
		}
		if ( guess == number )
		{
			System.out.println("You guessed it! What are the odds?!?" );
		}
		else if ( tries >= 7 )
		{
			System.out.println("Sorry you didn't guess it in 7 tries. You lose." );
		}


	}

}
