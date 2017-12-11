import java.util.Scanner;

public class BMICalcBetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		int feet, inches, pounds;
		Double height, weight, BMI;
		
		System.out.println( "BMI (Body Mass Index) is a way of representing your size." );
		System.out.println( "How many feet tall are you?" );
		feet = keyboard.nextInt();
		System.out.println( "How many inches?" );
		inches = keyboard.nextInt();
		System.out.println( "How many pounds do you weigh?" );
		pounds = keyboard.nextInt();
		
		height = feet * .3048 + inches * .0254;
		weight = pounds * .4536;
		BMI = weight / (height * height);
		
		System.out.println( "Your BMI is: " + BMI );
		
		if ( BMI < 18.6 )
		{
			System.out.println( "Yo are underweight" );	
		}
		if (18.4 < BMI && BMI < 25)
		{
			System.out.println( "You are normal" );
		}
		if (24.9 < BMI && BMI < 30)
		{
			System.out.println( "You are overweight" );
		}
		if (BMI > 29.9)
		{
			System.out.println( "You are obese" );
		}


	}

}
