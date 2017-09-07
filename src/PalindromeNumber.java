import java.util.*;
public class PalindromeNumber 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int number,arranged_Number=0,copy_Number,remainder;
		Scanner scane=new Scanner(System.in);
		System.out.println("Enter a number to check that the number is palindrome or not");
		number=scane.nextInt();
		
		copy_Number=number;
		
		while(number>0)
		{
			remainder=number%10;
			arranged_Number=arranged_Number*10+remainder;
			number=number/10;
		}
		if(arranged_Number==copy_Number)
			System.out.println(copy_Number+" is palindrome number");
		else
			System.out.println(copy_Number+" is not palindrome number");
	}

}
