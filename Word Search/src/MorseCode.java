import java.util.Scanner;

public class MorseCode extends Clues
	{
	public static String clue = "";
	//@Override
	public static String promptUser()
		{
		System.out.println("Please enter the word you want to convert to Morse Code.");
		Scanner input = new Scanner(System.in);
		return input.next();
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
	    return(clue);
		}
	
	@Override
	public void createClue()
		{
		numberReference.add(2);
		clueList.add(clue);
		}
	
	}
