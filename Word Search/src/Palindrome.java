
public class Palindrome extends Word
	{
	@Override
	public void promptUser()
		{
		//An overridden method from the word class
		System.out.println("Please enter at word you would like to make into a palindrome.");
		}
	
	public void makeAPalindrome()
		{
		//will take the input String and make it into Pig Latin
		//consider using the reverse method here
		}
	@Override
	public void createClue()
		{
		System.out.println("The palindrome of this word is ");
		//this is an overridden method from the word class
		}
	}
