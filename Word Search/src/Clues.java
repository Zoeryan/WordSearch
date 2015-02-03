import java.util.ArrayList;

public class Clues
	{
	public static ArrayList clueList = new ArrayList();
	
	public static void printClues()
		{
		
		for(int i = 0; i < clueList.size(); i ++)
			{
			switch(i)
				{
				case 1: 
					{
					System.out.println("The palindrome of this word is " + clueList.get(i) + ".");
					break;
					}
				case 2: 
					{
					System.out.println("This word is " + clueList.get(i) + " in Morse Code.");
					break;
					}
				case 3: 
					{
					System.out.println("This word is " + clueList.get(i) + " in the OP language.");
					break;
					}
				case 4: 
					{
					System.out.println("An anagram of this word is " + clueList.get(i) + ".");
					break;
					}
				case 5: 
					{
					System.out.println("This word is " + clueList.get(i) + " in Pig Latin.");
					break;
					}
				}
			}
		//will take the assembled clues from all other classes and print them out
		}
	}
