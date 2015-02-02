import java.util.Scanner;

import javax.swing.JFrame;
public class Runner
	{

	public static void main(String[] args)
		{
		MainScreen.makeMainScreen();
		MainScreen canvas = new MainScreen();
		
		
		JFrame frame = new JFrame();	       
		frame.setSize(400, 400);	       
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	     
		frame.getContentPane().add(canvas);	        
		frame.setVisible(true);	
		frame.setLocationRelativeTo(null);
		//UserPrompt.greetUser();
		//UserPrompt.printMainScreen();
		}

	}
