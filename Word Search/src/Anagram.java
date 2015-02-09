import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Anagram extends Clues
	{
	public Anagram(int r, String c)
		{
		super(r, c);
		}
	//@Override
	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String temp = JOptionPane.showInputDialog(frame, "Please enter the word you want to make into an anagram.");
		Board.wordSearchWords.add(temp);
		return temp;
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
	public static void createClue(String cl)
		{
		Clues c = new Clues(4 , cl);
		clueList.add(c);
		//Clues.clue = "";
		}
	}
