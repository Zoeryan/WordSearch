import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Board
	{
	public static ArrayList <String>wordSearchWords = new ArrayList<String>(); 
	static char board[][] = new char[20][20];
	public static void fillRandom()
		{
		Random r = new Random();		
		char Alphabet[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		for(int row = 0; row < board.length; row++)
			{
			for(int col = 0; col < board[row].length; col ++)
				{
				board[row][col] = Alphabet[r.nextInt(Alphabet.length)];
				}
	
			}
		System.out.println();
		}
	
	public static void fillBoard()
		{
		for(int i = 0; i < wordSearchWords.size(); i ++)
			{	
			if(i % 3 == 0)
				{
						String input = wordSearchWords.get(i);
						int length = input.length();
						int row = (int) (Math.random() * (20 - length));
						int col = (int) (Math.random() * (20 - length));
						for(int n = 0; n < length; n++)
							{
							board[row][col] = input.charAt(n);
							col++;
							}
								
					}
					
					
		
			else if(i % 3 == 1)
				{
					String input = wordSearchWords.get(i);
					int length = input.length();
					int row = (int) (Math.random() * (20 - length));
					int col = (int) (Math.random() * (20 - length));
					for(int n = 0; n < length; n++)
						{
						board[row][col] = input.charAt(n);
						row++;
						}
				}
					
				
			else if(i % 3 == 2)
				{
				String input = wordSearchWords.get(i);
				int length = input.length();
				int row = (int) (Math.random() * (20 - length));
				int col = (int) (Math.random() * (20 - length));
				for(int n = 0; n < length; n++)
					{
					board[row][col] = input.charAt(n);
					col++;
					row++;
					}
				
				}
		
					
			}
		}
	
	public static void printBoard()
		{
		for(int row = 0; row < board.length; row++)
			{
			for(int col = 0; col < board[row].length; col ++)
				{
				System.out.print(board[row][col] + " ");
				}
			System.out.println();
		}
		}

	}
