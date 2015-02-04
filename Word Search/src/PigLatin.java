import java.util.Scanner;

public class PigLatin extends Clues //extends Word
	{
	public static String clue = "";
	
	//@Override
	public static String promptUser()
		{
		System.out.println("Please enter the word you want to convert to Pig Latin.");
		Scanner input = new Scanner(System.in);
		String findFirstVowel = "";
		return findFirstVowel = input.nextLine();
		}
	
	public static String makePigLatin(String u)
		{
		u = u.toLowerCase();
        char v = Character.toLowerCase(u.charAt(0));

        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
        {
            String convertToPigLatin = u + "ay";
            System.out.println(convertToPigLatin);
        }
        else
        {
            String first = u.substring(0 , 1);
            String slice = u.substring(1 , u.length());
            clue = slice + first + "ay";
            clue = clue.toUpperCase();
            System.out.println(clue);
		}
        return(clue);
		}
	
	
	@Override
	public void createClue()
		{
		numberReference.add(5);
		clueList.add(clue);
		}
	}
