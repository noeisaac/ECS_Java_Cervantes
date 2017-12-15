import java.util.Scanner;
public class AddingValuesForLoops 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	int input;
	int sum;
	sum = 0;
	
	System.out.println("Number: " );
	input = keyboard.nextInt();
	
	for ( int n = 1; n <= input; n = n+1 )
	{
		sum = sum + n;
		System.out.println(n);
	}
	System.out.println("The sum is " + sum + ".");
	}
}
