import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class PigLatin extends Clues //extends Word
	{
	public static String clue = "";
	public PigLatin(int r, String c)
		{
		super(r, c);
		}
	//@Override
	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String clue = JOptionPane.showInputDialog(frame, "Please enter the word you want to make into Pig Latin.");
		return clue;
		}
	
	public static String makePigLatin(String u)
		{
		u = u.toLowerCase();
        char v = Character.toLowerCase(u.charAt(0));

        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
        {
            String convertToPigLatin = u + "ay";
            System.out.println(convertToPigLatin);
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
	public void createClue()
		{
		clueList.add(new Clues(5, clue));
		}
	}
a