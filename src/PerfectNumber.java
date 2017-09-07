import java.util.*;
public class PerfectNumber
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int number,sum,i;
		
		Scanner scane=new Scanner(System.in);
		System.out.println("Enter a number to check that the number is a perfect number");
		number=scane.nextInt();
		
		sum=0;
		for(i=1;i<number;i++)
		{
			if(number%i==0)
				sum=sum+i;
		}
		if(sum == number)
			System.out.println(number+" is perfect number");
		else
			System.out.println(number+" is not perfect number");
	}

}
