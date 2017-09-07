import java.util.*;
public class VowelOrConsonant 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		String character;
		
		Scanner scane=new Scanner(System.in);
		
		System.out.println("Enter a character from a to z to check that the character is vowel or consonant");
		character=scane.next();
		
		switch(character)
		{
			case "a":
				System.out.println(character+" is Vowel");
				break;
			case "e":
				System.out.println(character+" is Vowel");
				break;
			case "i":
				System.out.println(character+" is Vowel");
				break;
			case "o":
				System.out.println(character+" is Vowel");
				break;
			case "u":
				System.out.println(character+" is Vowel");
				break;
			default:
				System.out.println(character+" is Consonant");
		}
	}

}
