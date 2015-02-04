import java.util.Scanner;

public class OPLanguage extends Clues
	{
	public static String clue = "";
	//@Override
	public static String promptUser()
		{
		//An overridden method from the word class
		System.out.println("Please enter the word you want to convert to the OP language.");
		Scanner input = new Scanner(System.in);
		return input.next();
		}
	
	public static String makeOP(String w)
		{
		w = w.toLowerCase();
		int length = w.length();
		String clue = "";
		for (int i = 0; i < length - 1; i++)
			{
			clue = (w.substring(i , i + 2)) + "op";
			}
		clue = clue.toUpperCase();
		System.out.println(clue);
		return("test");
		}
	
	@Override
	public void createClue()
		{
		numberReference.add(3);
		clueList.add(clue);
		}

	}
