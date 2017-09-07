import java.util.*;
public class EvenAndOdd 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int number;
		Scanner scane=new Scanner(System.in);
		System.out.println("Enter a number to check that the number is Even or Odd");
		number=scane.nextInt();
		
		if(number%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}

}
