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
		JOptionPane.showMessageDialog(frame, "Let's make a word search!",
				"Welcome",
				JOptionPane.QUESTION_MESSAGE);	
		makeMainScreen();
		}
	public static void makeMainScreen()
		{
		Object[] optionOne = {"Palindrome" , "Morse Code" , "OP Language" , "Anagram" , "Pig Latin", "Finish"};
		type = JOptionPane.showOptionDialog(frame, "What kind of clue do you want to make?",
				"Clue Choice",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, optionOne, optionOne[5]);	
		
	switch(type)
	{
	
	case 0: 
		{
		String userInputPalindrome = Palindrome.promptUser();
		Palindrome.makeAPalindrome(userInputPalindrome);
		makeMainScreen();	
		break;
		}
	case 1:
		{
		String userInputMorse = MorseCode.promptUser();
		MorseCode.makeMorseCode(userInputMorse);
		makeMainScreen();	
		break;
		}
	case 2: 
		{
		String userInputOPLanguage = OPLanguage.promptUser();
		OPLanguage.makeOP(userInputOPLanguage);
		makeMainScreen();	
		break;
		}
	case 3:
		{
		String userInputAnagram = Anagram.promptUser();
		Anagram.makeAnagram(userInputAnagram);
		makeMainScreen();
		break;
		}
	case 4:
		{
		String userInputPigLatin = PigLatin.promptUser();
		PigLatin.makePigLatin(userInputPigLatin);
		makeMainScreen();
		break;
		}
	case 5:
		{
		System.out.println("Here is your word search!");
		System.out.println();
		Clues.printClues();
		Board.fillRandom();
		Board.fillBoard();
		Board.printBoard();
		}

	}
		}

	}
