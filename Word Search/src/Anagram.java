import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Anagram extends Clues
	{
	public static String clue ="";
	public Anagram(int r, String c)
		{
		super(r, c);
		}
	//@Override
	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String clue = JOptionPane.showInputDialog(frame, "Please enter the word you want to make into an anagram.");
		return clue;
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

	//@Override
	public void createClue()
		{
		clueList.add(new Clues(4, clue));
		}
	}
