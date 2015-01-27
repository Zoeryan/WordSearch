import java.util.Scanner;


public class OPLanguage extends Word implements Conversion
	{
	//@Override
	public static void promptUser()
		{
		//An overridden method from the word class
		System.out.println("Please enter the word you want to convert to the OP language.");
		Scanner input = new Scanner(System.in);
		String userInput = input.next();
		}
	
	public void makeOP()
		{
		//will take the input String and make it into OP
		}
	@Override
	public void createClue()
		{
		System.out.println("The OP of this word is ");
		//this is an overridden method from the word class
		}
	@Override
	public void covert()
		{
		//will convert to OP
		}
	}
