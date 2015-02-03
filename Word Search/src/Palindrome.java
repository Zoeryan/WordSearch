import java.util.Scanner;


public class Palindrome extends Clues
	{
	public static String clue = "";
	//@Override
	public static String promptUser()
		{
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
	
	//@Override
	public void createClue()
		{
		clueList.add(5 , clue);
		}
	}
