import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Anagram extends Clues
	{
	public static String clue ="";
	//@Override
	public static String promptUser()
		{
		System.out.println("Please enter the word you want to make into an anagram.");
		Scanner input = new Scanner(System.in);
		return input.next();
		}
	
	public static String makeAnagram(String s)
		{
		s = s.toLowerCase();
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
		clue = clue.toUpperCase();
		System.out.println(clue);
		return(clue);

		}

	@Override
	public void createClue()
		{
		numberReference.add(4);
		clueList.add(clue);
		System.out.println(clueList);
		}
	}
