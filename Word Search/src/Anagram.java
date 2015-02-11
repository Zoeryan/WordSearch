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

	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String temp = JOptionPane.showInputDialog(frame, "Please enter the word you want to make into an anagram.");
		for(int i = 0; i < temp.length(); i ++)
			{
			if(Character.isLetter(temp.charAt(i)))
				{
				//temp = temp.toUpperCase();
				Board.wordSearchWords.add(temp);			
				}
			else
				{
				System.out.println("Please enter a word.");
				MainScreen.makeMainScreen();
				}
			}
		return temp;
		}
	
	public static String makeAnagram(String s)
		{
		Clues b = new Clues(4 , "");
		s = s.toLowerCase();
		ArrayList <String> shuffle = new ArrayList();
			for(int i = 0; i < s.length(); i ++)
				{
				shuffle.add(i, s.substring(i , i + 1));
				}
			Collections.shuffle(shuffle);

		for (int w = 0; w < shuffle.size(); w ++)
			{
			b.setClue(b.getClue() + shuffle.get(w));
			}
		b.setClue(b.getClue().toUpperCase());	
		Clues.clueList.add(b);
		return b.getClue();

		}

	
	}
