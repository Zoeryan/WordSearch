import java.util.Scanner;

public class MorseCode extends Clues implements Conversion
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

		String[] dots = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
	            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
	            "-.--", "--..", ".----", "..---"};
	            
	    String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
	    	     "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
	    	     "w", "x", "y", "z"};
	    
	    for(int i = 0; i < u.length(); i++)
	    	{
	    	for(int j = 0; j < u.length(); j++)
	    		{
	    		if(u.substring(i , i + 1).equals(alpha[j]))
	    			{
	    			clue += dots[j];    		
	    			}
	    		}
	    	}
	    System.out.println(clue);
	    return(clue);
		}
	
	//@Override
	public void createClue()
		{
		clueList.add(2 , clue);
		}
	
	@Override
	public void covert()
		{
		//will convert to Morse Code
		}
	}
