import java.util.ArrayList;
import java.util.Random;
public class Board
	{
	public static  ArrayList <String> wordSearchWords = new ArrayList<String>(); 
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
			String wordSearchInput = wordSearchWords.get(i);
			int length = wordSearchInput.length();
			int row = (int) (Math.random() * 20);
			int col = (int) (Math.random() * 20);
			if(i % 2 == 0)
				{									
				if((20 - col) > length)
					{
					row = (int) (Math.random() * 20);
					col = (int) (Math.random() * 20);
					}
				else
					{
					for(int y = 0; y < length; y++)
						{
						board[row][col] = wordSearchInput.charAt(y);
						}
					}	
				}
			
			for(int v = 0; v < wordSearchInput.length(); v++)
				{
				if(i % 2 != 0)
					{
						{									
						if((20 - col) > length)
							{
							row = (int) (Math.random() * 20);
							col = (int) (Math.random() * 20);
							}
						else
							{
							for(int y = length; y > 0; y++)
								{
								board[row][col] = wordSearchInput.charAt(y);
								}
							}	
						}
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
