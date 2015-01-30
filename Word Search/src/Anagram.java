import java.util.Scanner;

public class Anagram extends Word
	{
	//@Override
	public static String promptUser()
		{
		//An overridden method from the word class
		System.out.println("Please enter the word you want to convert to Morse Code.");
		Scanner input = new Scanner(System.in);
		return input.next();
		}
	
	public void makeAnagram()
		{
		
		
		//will take the input String make a anagram of that word
		}
//	@Override
//	public void createClue()
//		{
//		System.out.println("An anagram for this word is ");
//		//this is an overridden method from the word class
//		}
	}
