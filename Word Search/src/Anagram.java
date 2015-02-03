import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Anagram extends Clues
	{
	public static String clue ="";
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
		ArrayList <String> shuffle = new ArrayList();
			for(int i = 0; i < s.length(); i ++)
				{
				shuffle.add(i, s.substring(i , i + 1));
				}
			Collections.shuffle(shuffle);

		for (int w = 0; w < shuffle.size(); w ++)
			{
			clue += shuffle.get(w);
			}
		System.out.println(clue);
		return(clue);

		}
//	@Override
	public void createClue()
		{
		clueList.add(4 , clue);
		}
	}
