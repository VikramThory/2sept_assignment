import java.util.*;
import static java.lang.StrictMath.pow;
public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		double sum,remainder,digits;
		int temp_Number,number;
		sum=0;digits=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input a number to check that it is a Armstrong number or not");
		number=scan.nextInt();
		
		temp_Number=number;		
		while(temp_Number !=0)
		{
			digits++;
			temp_Number=temp_Number/10;
		}
		System.out.println(digits);

		temp_Number=number;
	
		while(temp_Number !=0)
		{
			remainder=temp_Number%10;
			System.out.println(remainder);
			sum=sum+pow(remainder,digits);
		
			temp_Number=temp_Number/10;
		}
		System.out.println(sum);
		if(number == sum)
			System.out.println(number+" is an Armstrong number");
		else
			System.out.println(number+" is not an Armstrong number");
	}

}
