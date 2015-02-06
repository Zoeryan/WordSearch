import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MorseCode extends Clues
	{

	public MorseCode(int r, String c)
		{
		super(r, c);
		}

	//@Override
	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String clue = JOptionPane.showInputDialog(frame, "Please enter the word you want to convert to Morse Code.");
		return clue;
		}
	
	public static String makeMorseCode(String u)
		{
		u = u.toLowerCase();
		String[] dots = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
	            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
	            "-.--", "--..", ".----", "..---"};
	            
	    char [] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
	    	     'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
	    	     'w', 'x','y', 'z'};
	    
	    for(int i = 0; i < alpha.length; i++)
	    	{
	    	for(int j = 0; j < u.length(); j++)
	    		{
	    		if(alpha[i] == u.charAt(j))
	    			{
	    			clue += dots[i] + " ";
	    			}
	    		}
	    	}
	    clue = clue.toUpperCase();
	    System.out.println(clue);
	    clue = "";
	    return(clue);
		}
	
	//@Override
	public static void createClue()
		{
		Clues c = new Clues(2 , clue);
		clueList.add(c);
		}
	
	}
