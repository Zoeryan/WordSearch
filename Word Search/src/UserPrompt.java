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
		System.out.println("3. Make it into the OP language");
		System.out.println("4. Make it an anagram");
		System.out.println("5. Make it into Pig Latin");
		Scanner input = new Scanner(System.in);
		int userInput = input.nextInt();
		
		switch(userInput)
		{
		case 1: 
			{
			String userInputPalindrome = Palindrome.promptUser();
			Palindrome.makeAPalindrome(userInputPalindrome);
			break;
			}
		case 2:
			{
			String userInputMorse = MorseCode.promptUser();
			MorseCode.makeMorseCode(userInputMorse);
			//Does not print the morse code clue
			break;
			}
		case 3: 
			{
			String userInputOPLanguage = OPLanguage.promptUser();
			OPLanguage.makeOP(userInputOPLanguage);
			break;
			}
		case 4:
			{
			Anagram.promptUser();
			break;
			}
		case 5:
			{
			String userInputPigLatin = PigLatin.promptUser();
			PigLatin.makePigLatin(userInputPigLatin);
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
