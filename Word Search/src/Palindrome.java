import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Palindrome extends Clues 
	{	
	public Palindrome(int r, String c)
		{
		super(r, c);
		}
	
	
	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String temp = JOptionPane.showInputDialog(frame, "Please enter the word you want to make into a palindrome.");
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
	
	public static String makeAPalindrome(String s)
		{
		Clues n = new Clues(1 , "");
		s = s.toLowerCase();
		int length = s.length();
		for ( int i = length - 1 ; i >= 0 ; i-- )
			{
		    n.setClue(n.getClue() + s.substring(i , i + 1));
			}
		n.setClue(n.getClue().toUpperCase());	
		Clues.clueList.add(n);
		return n.getClue();
		}

	} 
