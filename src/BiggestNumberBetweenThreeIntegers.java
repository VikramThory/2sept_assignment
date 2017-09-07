import java.util.*;
public class BiggestNumberBetweenThreeIntegers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int number1,number2,number3,big_Number;
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter three number");
		System.out.println("To check the biggest between these numbers");
		
		number1=Scan.nextInt();
		number2=Scan.nextInt();
		number3=Scan.nextInt();
		
		if(number1>number2)
		{
			if(number1>number3)
				big_Number=number1;
			else
				big_Number=number3;
		}
		else
		{
			if(number2>number3)
				big_Number=number2;
			else
				big_Number=number3;
		}
		
		System.out.println(big_Number+" is the biggest number");
	}

}
