import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class Palindrome extends Clues
	{	
	public Palindrome(int r, String c)
		{
		super(r, c);
		}
	
	//@Override
	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String temp = JOptionPane.showInputDialog(frame, "Please enter the word you want to make into a palindrome.");
		Board.wordSearchWords.add(temp);
		return temp;
		}
	
	public static String makeAPalindrome(String s)
		{
		s = s.toLowerCase();
		int length = s.length();
		for ( int i = length - 1 ; i >= 0 ; i-- )
			{
		     clue += s.charAt(i);
			}
		clue = clue.toUpperCase();
		System.out.println(clue);
		return(clue);
		}
	
	//@Override
	public static void createClue(String cl)
		{
		Clues c = new Clues(1 , cl);
		clueList.add(c);
		//Clues.clue = "";
		}
	}
