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
		s = s.toLowerCase();
		int length = s.length();
		String clue = "";
		for ( int i = length - 1 ; i >= 0 ; i-- )
			{
		     clue = clue + s.charAt(i);
			}
		clue = clue.toUpperCase();
		System.out.println(clue);
		return(clue);
		}
	
	//@Override
	public static void createClue()
		{
		numberReference.add(1);
		clueList.add(clue);
		}
	}
