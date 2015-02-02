import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Anagram extends Word
	{
	
	//@Override
	public static String promptUser()
		{
		//An overridden method from the word class
		System.out.println("Please enter the word you want to make into an anagram.");
		Scanner input = new Scanner(System.in);
		return input.next();
		}
	
	public static String makeAnagram(String s)
		{
		ArrayList shuffle = new ArrayList();
			for(int i = 0; i < s.length(); i ++)
				{
				shuffle.add(i);
				}
			Collections.shuffle(shuffle);
			System.out.println(shuffle);
			String clue = "";

		for (int w = 0; w < shuffle.size(); w ++)
			{
			clue = clue + shuffle.get(w);
			}
		System.out.println(clue);
		return(clue);
		//will take the input String make a anagram of that word
		}
//	@Override
//	public void createClue()
//		{
//		System.out.println("An anagram for this word is ");
//		//this is an overridden method from the word class
//		}
	}
