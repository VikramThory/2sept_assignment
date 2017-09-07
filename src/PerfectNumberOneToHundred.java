
public class PerfectNumberOneToHundred 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int sum,number,i;
		System.out.println("Perfect number between 1 to 100");
		
		sum=0;
	   
	   for(number=1;number<=100;number++)
	   {
	    	for(i=1;i<=number;i++)
	    	{
	    		if(number%i==0)
	    			sum=sum+i;
	    		System.out.println(sum);
	    	}
	    	if(sum==number)
	    		System.out.println(number);
	    	
	   }
	}

}
