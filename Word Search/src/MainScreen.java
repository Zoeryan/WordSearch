import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainScreen extends JPanel 
	{
	static int type; 
	static JFrame frame = new JFrame();

			
	public static void welcomeUser()
		{
		Object[] welcome = {"Continue"};
		type = JOptionPane.showOptionDialog(frame, "Let's make a word search!",
				"Welcome",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,welcome, welcome[0]);	
			
	switch(type)
		{
		case 0:
			{
			makeMainScreen();
			}
		}
		
		}
	public static void makeMainScreen()
		{
		Object[] optionOne = {"Palindrome" , "Morse Code" , "OP Language" , "Anagram" , "Pig Latin"};
		type = JOptionPane.showOptionDialog(frame, "What kind of clue do you want to make?",
				"Clue Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionOne, optionOne[4]);	
		
	switch(type)
	{
	
	case 0: 
		{
		String userInputPalindrome = Palindrome.promptUser();
		Palindrome.makeAPalindrome(userInputPalindrome);	
		//Palindrome.makeClue(clue);
		break;
		}
	case 1:
		{
		String userInputMorse = MorseCode.promptUser();
		MorseCode.makeMorseCode(userInputMorse);
		//Palindrome.makeClue(clue);
		//Does not print the morse code clue
		break;
		}
	case 2: 
		{
		String userInputOPLanguage = OPLanguage.promptUser();
		OPLanguage.makeOP(userInputOPLanguage);
		//Palindrome.makeClue(clue);
		break;
		}
	case 3:
		{
		String userInputAnagram = Anagram.promptUser();
		Anagram.makeAnagram(userInputAnagram);
		//Palindrome.makeClue(clue);
		//Does not print the anagram
		break;
		}
	case 4:
		{
		String userInputPigLatin = PigLatin.promptUser();
		PigLatin.makePigLatin(userInputPigLatin);
		//Palindrome.makeClue(clue);
		break;
		}
	
	default:
		{
		System.out.println("Please select one of the listed options.");
		//printMainScreen();
		}
	}
		}

	}
