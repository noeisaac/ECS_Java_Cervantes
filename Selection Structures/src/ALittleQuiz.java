import java.util.Scanner;

public class ALittleQuiz {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int one, two, three;
		
		System.out.println( "Q1) What is the capital of Alaska?" );
		System.out.println( "        1) Melbourne" );
		System.out.println( "        2) Anchorage" );
		System.out.println( "        3) Juneau" );
		one = keyboard.nextInt();
		if ( 0 < one && one < 3 )
		{
			System.out.println( "Sorry, Juneau is the right answer." );
		}
		if ( 2 < one && one < 4 )
		{
			System.out.println( "That's correct!" );
		}
		
		System.out.println( "Q2) Can you store the value 'cat' in a variable of type int?" );
		System.out.println( "        1) yes" );
		System.out.println( "        2) noe" );
		two = keyboard.nextInt();
		if ( 0 < two && two < 2 )
		{
			System.out.println( "Sorry, no is the right answer." );
		}
		if ( 1 < two && two < 3 )
		{
			System.out.println( "That's corect!" );
		}
		
		System.out.println( "Q3) What is the result of 9+6/3" );
		System.out.println( "        1) 5" );
		System.out.println( "        2) 7" );
		three = keyboard.nextInt();
		if ( 0 < three && three < 2 )
		{ 
			System.out.println( "That's correct!" );
		}
		if ( 1 > three )
		{
			System.out.println( "Sorry, 5 is the correct answer." );
		}
		
		
			

	}

}
