import static java.lang.StrictMath.pow;
public class ArmstrongNumberBetweenHundredToFiveHundred
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		double sum,remainder,digits;
		int number,temp_Number;
		sum=0;digits=0;
		
		System.out.println("Armstrong number from 100 to 500");
		
		for(number=100;number<=500;number++)
		{
			temp_Number=number;
		
			while(number !=0)
			{
				digits++;
				number=number/10;
			}
		
			number=temp_Number;
		
			while(number !=0)
			{
				remainder=number%10;
				sum=sum+pow(remainder,digits);
				number=number/10;
			}
		 System.out.println(number);
			if(temp_Number == sum)
				System.out.println(temp_Number);
			//System.out.println(temp_Number);
		}
	}
}
