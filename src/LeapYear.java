import java.util.*;
public class LeapYear
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	
		int year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a year to check that year is leap year or not ");
		year=scanner.nextInt();
		
		if(year%100==0)
		{
			if(year%400==0)
				System.out.println(year+" is leap year");
			else
				System.out.println(year+" is not leap year");
		}
		else
		{
			if(year%4==0)
				System.out.println(year+" is leap year");
			else
				System.out.println(year+" is not leap year");
		}
	}

}
