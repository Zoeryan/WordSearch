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
		String clue = JOptionPane.showInputDialog(frame, "Please enter the word you want to convert to the OP language.");
		return clue;
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
		clue = "";
		return(clue);
		}
	
	//@Override
	public static void createClue()
		{
		Clues c = new Clues(3 , clue);
		clueList.add(c);
		}

	}
