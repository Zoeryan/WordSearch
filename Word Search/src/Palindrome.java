import java.util.Scanner;


public class Palindrome extends Word
	{
	//@Override
	public static void promptUser()
		{
		//An overridden method from the word class
		System.out.println("Please enter the word you want to make into a palindrome.");
		Scanner input = new Scanner(System.in);
		String userInput = input.next();
		}
	
	public static void makeAPalindrome(String userInput)
		{
		//will take the input String and make it into Pig Latin
		//consider using the reverse method here
		int length = userInput.length();
		String clue = "";
		for ( int i = length - 1 ; i >= 0 ; i-- )
		     clue = clue + userInput.charAt(i);
		}
	@Override
	public void createClue()
		{
		System.out.println("The palindrome of this word is ");
		//this is an overridden method from the word class
		}
	}
