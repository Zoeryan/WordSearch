import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class PigLatin extends Clues
	{
	public PigLatin(int r, String c)
		{
		super(r, c);
		}

	public static String promptUser()
		{
		JFrame frame = new JFrame();
		String temp = JOptionPane.showInputDialog(frame, "Please enter the word you want to make into Pig Latin.");
		for(int i = 0; i < temp.length(); i ++)
			{
			if(Character.isLetter(temp.charAt(i)))
				{
							
				}
			else
				{
				System.out.println("Please enter a word.");
				MainScreen.makeMainScreen();
				}
			}
		//temp = temp.toUpperCase();
		Board.wordSearchWords.add(temp);
		return temp;
		}
	
	public static String makePigLatin(String u)
		{
		Clues s = new Clues(5 , ""); 
		u = u.toLowerCase();
        char v = Character.toLowerCase(u.charAt(0));

        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u')
        {
            s.setClue(u + "ay");
            s.setClue(s.getClue().toUpperCase());	
    		Clues.clueList.add(s);
        }
        else
        {
            String first = u.substring(0 , 1);
            String slice = u.substring(1 , u.length());
            s.setClue(slice + first + "ay");
            s.setClue(s.getClue().toUpperCase());	
    		Clues.clueList.add(s);

		}
		return s.getClue();
		}

	}