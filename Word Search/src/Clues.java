import java.util.ArrayList;

public class Clues
	{
	public static int referenceNumber;
	public static String clue;
	
	public Clues(int r, String c)
		{
		referenceNumber = r;
		clue = c;
		}
	
	public static ArrayList <Clues> clueList = new ArrayList<Clues>();


	public static int getReferenceNumber()
		{
		return referenceNumber;
		}


	public static String getClue()
		{
		return clue;
		}

	public static void printClues()
		{
		for(int i = 0; i < clueList.size(); i ++)
			{
			if(clueList.get(i).getReferenceNumber() == 1)
				{
				System.out.println("The palindrome of this word is " + getClue() + ".");
				}
			else if(clueList.get(i).getReferenceNumber() == 2)
				{
				System.out.println("This word is " + clueList.get(i).getClue() + " in Morse Code.");
				}
			else if(clueList.get(i).getReferenceNumber() == 3)
				{
				System.out.println("This word is " + getClue() + " in the OP language.");
				}
			else if(clueList.get(i).getReferenceNumber() == 4)
				{
				System.out.println("An anagram of this word is " + getClue() + ".");
				}
			else if(clueList.get(i).getReferenceNumber() == 5)
				{
				System.out.println("This word is " + getClue() + " in Pig Latin.");
				}
			
			}
	
		}
	}
