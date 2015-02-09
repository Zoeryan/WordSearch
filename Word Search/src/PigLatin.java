import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class PigLatin extends Clues //extends Word
	{
	public PigLatin(int r, String c)
		{
		super(r, c);
		}
	//@Override
	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String temp = JOptionPane.showInputDialog(frame, "Please enter the word you want to make into Pig Latin.");
		Board.wordSearchWords.add(temp);
		return temp;
		}
	
	public static String makePigLatin(String u)
		{
		u = u.toLowerCase();
        char v = Character.toLowerCase(u.charAt(0));

        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
        {
            clue = u + "ay";
            clue = clue.toUpperCase();
            System.out.println(clue);
        }
        else
        {
            String first = u.substring(0 , 1);
            String slice = u.substring(1 , u.length());
            clue = slice + first + "ay";
            clue = clue.toUpperCase();
            System.out.println(clue);
		}
        return(clue);
		}
	
	
	//@Override
	public static void createClue(String cl)
		{
		Clues c = new Clues(5 , cl);
		clueList.add(c);
		//Clues.clue = "";
		}
	}