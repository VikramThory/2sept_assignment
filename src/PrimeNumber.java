import java.util.*;
public class PrimeNumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int number,i;
		
		Scanner scane=new Scanner(System.in);
		
		System.out.println("Enter a number to check that the number is Prime or not");
		number=scane.nextInt();
		
		i=2;
		while(i<=number/2)
		{
			if(number%i==0)
			{
				System.out.println(number+" is not Prime Number");
				break;
			}
			else
				i=i+1;
		}
		if(!(i<=number/2))
		System.out.println(number+" is Prime Number");
	}

}
