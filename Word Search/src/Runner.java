import java.util.Scanner;
public class Runner
	{

	public static void main(String[] args)
		{
		String userInput = MorseCode.promptUser();
		MorseCode.makeMorseCode(userInput);
		UserPrompt.greetUser();
		UserPrompt.printMainScreen();
		//Word [] word = new Word [5];

		}

	}
