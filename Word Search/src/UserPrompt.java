import java.util.Scanner;
public class UserPrompt
	{
	public static void greetUser()
		{
		System.out.println("Let's make a word search!");
		System.out.println();
		}
	public static void printMainScreen()
		{		
		System.out.println("Please enter the number of the clue you want to make.");
		System.out.println("1. Make a palindrome");
		System.out.println("2. Make it Morse code");
		System.out.println("3. My is into the OP language");
		System.out.println("4. Make it an anagram");
		System.out.println("5. Make it into Pig Latin");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		
		switch(userInput)
		{
		case 1: 
			{
			Palindrome.promptUser();
			break;
			}
		case 2:
			{
			MorseCode.promptUser();
			break;
			}
		case 3: 
			{
			OPLanguage.promptUser();
			break;
			}
		case 4:
			{
			Anagram.promptUser();
			break;
			}
		case 5:
			{
			PigLatin.promptUser();
			break;
			}
		default:
			{
			System.out.println("Please select one of the listed options.");
			printMainScreen();
			}
		}
		
		}
	}
