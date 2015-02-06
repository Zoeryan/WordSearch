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
		String clue = JOptionPane.showInputDialog(frame, "Please enter the word you want to make into a palindrome.");
		return clue;
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
		clue = "";
		return(clue);
		}
	
	//@Override
	public static void createClue()
		{
		Clues c = new Clues(1 , clue);
		clueList.add(c);
		}
	}
