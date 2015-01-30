import java.util.Scanner;

public class MorseCode extends Word implements Conversion
	{
	//@Override
	public static String promptUser()
		{
		System.out.println("Please enter the word you want to convert to Morse Code.");
		Scanner input = new Scanner(System.in);
		return input.next();
		}
	
	public static String makeMorseCode(String u)
		{
		String clue = "";
		String[] dottie = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
	            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
	            "-.--", "--..", ".----", "..---"};
	            
	    String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
	    	     "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
	    	     "w", "x", "y", "z"};
	    
	    for(int i = 0; i < u.length(); i ++)
	    	{
	    	char[] chars = u.toCharArray();
	    	if(u.substring(i , i + 1).equals(alpha[i]))
	    		{
	    		dottie[i] = alpha[i];
	    		clue.toUpperCase();
	    		clue = (clue + dottie[i]);
	    		
	    		}
	    	
	    	}
	    System.out.println(clue);
	    return("test");
		}
	
//	@Override
//	public void createClue()
//		{
//		System.out.println("The morse of this word is ");
//		//this is an overridden method from the word class
//		}
//	
	@Override
	public void covert()
		{
		//will convert to OP
		}
	}
