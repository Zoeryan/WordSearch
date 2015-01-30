import java.util.Scanner;


public class PigLatin extends Word
	{
	//@Override
	public static String promptUser()
		{
		//An overridden method from the word class
		System.out.println("Please enter the word you want to convert to Pig Latin.");
		Scanner input = new Scanner(System.in);
		String findFirstVowel = "";
		return findFirstVowel = input.nextLine();
		}
	
	public static String makePigLatin(String u)
		{
		
        char v = Character.toLowerCase(u.charAt(0));

        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
        {
            String convertToPigLatin = u + "ay";
            System.out.println(convertToPigLatin);
        }
        else
        {
            String first = u.substring(0,1);
            String slice = u.substring(1,u.length());
            String clue = slice + first + "ay";
            System.out.println(clue);
		}
        return("");
		}
//	@Override
//	public void createClue()
//		{
//		System.out.println("The pig latin of this word is ");
//		//this is an overridden method from the word class
//		}
	}
