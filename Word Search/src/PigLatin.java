import java.util.Scanner;


public class PigLatin extends Word
	{
	//@Override
	public static void promptUser()
		{
		//An overridden method from the word class
		System.out.println("Please enter the word you want to convert to Pig Latin.");
		Scanner input = new Scanner(System.in);
		String userInput = input.next();
		}
	
	public void makePigLatin()
		{
		//will take the input String and make it into Pig Latin
		}
	@Override
	public void createClue()
		{
		System.out.println("The pig latin of this word is ");
		//this is an overridden method from the word class
		}
	}
