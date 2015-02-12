import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class OPLanguage extends Clues
	{

	public OPLanguage(int r, String c)
		{
		super(r, c);
		}
	

	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String temp = JOptionPane.showInputDialog(frame, "Please enter the word you want to convert to the OP language.");
		for(int i = 0; i < temp.length(); i ++)
			{
			if(Character.isLetter(temp.charAt(i)))
				{
							
				}
			else
				{
				System.out.println("Please enter a word.");
				MainScreen.makeMainScreen();
				}
			}
		//temp = temp.toUpperCase();
		Board.wordSearchWords.add(temp);
		return temp;
		}
	
	public static String makeOP(String w)
		{
		Clues c = new Clues(3 , "");
		w = w.toLowerCase();
		int length = w.length();
		for (int i = 0; i < length - 1; i++)
			{
			c.setClue((w.substring(i , i + 2)) + "op");
			}
		c.setClue(c.getClue().toUpperCase());	
		Clues.clueList.add(c);
		return c.getClue();
		}
	

	}
