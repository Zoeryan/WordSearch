import java.util.Scanner;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainScreen extends JPanel 
	{
	static int type; 
	static JFrame frame = new JFrame();

	/**
	 * Create the panel.
	 */
	public static void makeMainScreen()
		{
		Object[] optionsThree = {"Palindrome" , "Morse Code" , "OP Language" , "Anagram" , "Pig Latin"};
		type = JOptionPane.showOptionDialog(frame, "what kind of clue do you want to make?",
				"Clue Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionsThree, optionsThree[1]);	
		
	switch(type)
	{
	
	case 1: 
		{
		String userInputPalindrome = Palindrome.promptUser();
		Palindrome.makeAPalindrome(userInputPalindrome);
		//Palindrome.makeClue(clue);
		break;
		}
	case 2:
		{
		String userInputMorse = MorseCode.promptUser();
		MorseCode.makeMorseCode(userInputMorse);
		//Palindrome.makeClue(clue);
		//Does not print the morse code clue
		break;
		}
	case 3: 
		{
		String userInputOPLanguage = OPLanguage.promptUser();
		OPLanguage.makeOP(userInputOPLanguage);
		//Palindrome.makeClue(clue);
		break;
		}
	case 4:
		{
		String userInputAnagram = Anagram.promptUser();
		MorseCode.makeMorseCode(userInputAnagram);
		//Palindrome.makeClue(clue);
		//Does not print the anagram
		break;
		}
	case 5:
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
