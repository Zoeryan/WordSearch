import java.util.ArrayList;
import java.util.Random;
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
			System.out.println();
			}
		}
	public static void fillBoard()
		{
		for(int i = 0; i < Clues.clueList.size(); i ++)
			{	
			String input = wordSearchWords.get(i);
			int length = input.length();
			int row = (int) (Math.random() * 20);
			int col = (int) (Math.random() * 20);
				{									
				if((20 - col) > length)
					{
					
					}
				else
					{
					for(int y = 0; y < length; y++)
						{
						board[row][col] = input.charAt(y);
						}
					}
				}
				
			}
		}
	
	public static void printBoard()
		{
		System.out.println(wordSearchWords);
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
