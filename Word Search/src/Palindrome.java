import java.util.Scanner;


public class Palindrome extends Word
	{
	//@Override
	public static String promptUser()
		{
		//An overridden method from the word class
		System.out.println("Please enter the word you want to make into a palindrome.");
		Scanner input = new Scanner(System.in);
		return input.next();
		}
	
	public static String makeAPalindrome(String s)
		{
		int length = s.length();
		String clue = "";
		for ( int i = length - 1 ; i >= 0 ; i-- )
		     clue = clue + s.charAt(i);

		System.out.println(clue);
		return("test");
		}
	
//	@Override
//	public void createClue()
//		{
//		System.out.println("The palindrome of this word is ");
//		//this is an overridden method from the word class
//		}
	}
