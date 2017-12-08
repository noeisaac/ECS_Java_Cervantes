import java.util.Scanner;

public class TwoQuestions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String one, two;
		
		System.out.println( "Think of an object, and I'll try and guess what it is!" );
		System.out.println( "Question 1) Is it an animal, vegitable, or mineral?" );
		one = keyboard.next();
		System.out.println( "Question 2) Is it bigger than a breadbox?" );
		two = keyboard.next();
		if ( one.equals("animal") && two.equals("yes") )
		{
			System.out.println( "Is it a sqirrel?!" );
		}
		if ( one.equals("animal") && two.equals("no") )
		{
			System.out.println( "Is it a moose?!" );
		}
		if ( one.equals("vegetable") && two.equals("yes"))
		{
			System.out.println("Is it a carrot?!" );
		}
		if (one.equals("vegetable") && two.equals("no"))
		{
			System.out.println("Is it a watermelon?!" );
		}
		if ( one.equals("mineral") && two.equals("yes"))
		{
			System.out.println( "Is it a paperclip?!" );
		}
		if ( one.equals("mineral") && two.equals("no"))
		{
			System.out.println( "Is it a camaro?!" );
		}

	}

}
