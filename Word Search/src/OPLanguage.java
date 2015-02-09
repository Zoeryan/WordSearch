import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class OPLanguage extends Clues
	{

	public OPLanguage(int r, String c)
		{
		super(r, c);
		}
	//@Override
	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String temp = JOptionPane.showInputDialog(frame, "Please enter the word you want to convert to the OP language.");
		Board.wordSearchWords.add(temp);
		return temp;
		}
	
	public static String makeOP(String w)
		{
		w = w.toLowerCase();
		int length = w.length();
		for (int i = 0; i < length - 1; i++)
			{
			clue = (w.substring(i , i + 2)) + "op";
			}
		clue = clue.toUpperCase();
		System.out.println(clue);
		
		return clue;
		}
	
	//@Override
	public static void createClue(String cl)
		{
		Clues c = new Clues(3 , cl);
		clueList.add(c);
		//Clues.clue = "";
		}

	}
