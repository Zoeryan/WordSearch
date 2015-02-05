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
	
	public static void setReferenceNumber(int referenceNumber)
		{
		Clues.referenceNumber = referenceNumber;
		}

	public static void setClue(String clue)
		{
		Clues.clue = clue;
		}


	

	public static void printClues()
		{
		for(int i = 0; i < clueList.size(); i ++)
			{
			if(clueList.getReferenceNumber(i).equals(1))
				{
				
				}
//			switch(i)
//				{				
//				case 1: 
//					{
//					System.out.println("The palindrome of this word is " + clueList.get(i).getClue() + ".");
//					break;
//					}
//				case 2: 
//					{
//					System.out.println("This word is " + clueList.get(i).getClue() + " in Morse Code.");
//					break;
//					}
//				case 3: 
//					{
//					System.out.println("This word is " + clueList.get(i).getClue() + " in the OP language.");
//					break;
//					}
//				case 4: 
//					{
//					System.out.println("An anagram of this word is " + clueList.get(i).getClue() + ".");
//					break;
//					}
//				case 5: 
//					{
//					System.out.println("This word is " + clueList.get(i).getClue() + " in Pig Latin.");
//					break;
//					}
				}
			}
		System.out.println(clueList);
		}
	
	//public abstract void createClue();
	}
