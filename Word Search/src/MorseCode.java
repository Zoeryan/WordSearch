import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MorseCode extends Clues 
	{

	public MorseCode(int r, String c)
		{
		super(r, c);
		}


	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String temp = JOptionPane.showInputDialog(frame, "Please enter the word you want to convert to Morse Code.");
		Board.wordSearchWords.add(temp);
		return temp;
		}
	
	public static String makeMorseCode(String u)
		{
		Clues p = new Clues(2 , "");
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
	    			p.setClue(p.getClue() + dots[i] + " ");
	    			}
	    		}
	    	}
	    p.setClue(p.getClue().toUpperCase());	
		System.out.println(p.getClue());
		Clues.clueList.add(p);
		return p.getClue();
		}

	
	}
