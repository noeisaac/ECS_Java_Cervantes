
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int n = 1; n <= 100; n = n+1)
		{
			System.out.println(n);
			if (n %3== 0)
			{
				System.out.println("Fizz");
			}
			else if (n %5== 0)
			{
				System.out.println("Buzz");
			}
			else if (n %3== 0 && n %5== 0)
			{
				System.out.println("FizzBuzz");
			}
		}

	}

}
