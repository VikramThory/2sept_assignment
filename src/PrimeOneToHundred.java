
public class PrimeOneToHundred 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int number,i;
		System.out.println("Prime number between 1 to 100");
		
		for(number=2;number<=100;number++)
		{
			i=2;
			while(i<=number/2)
			{
				if(number%i==0)
				{
					break;
				}
				else
					i=i+1;
			}
			if(!(i<=number/2))
				System.out.println(number);
		}
	}

}
