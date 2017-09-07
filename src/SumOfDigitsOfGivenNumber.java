import java.util.*;
public class SumOfDigitsOfGivenNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int number,sum,q,remainder,temp_number;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number and get the sum of all of it's digits");
		number=scan.nextInt();
		
		temp_number=number;
		int i=0;
		sum=0;
		while(number>0)
		{
			remainder=number%10;
			sum=sum+remainder;
			number /=10;
		}
		System.out.println("Sum of entered number digits is : "+sum);
	}

}
