import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		String fileName = "EvilHangman/dictionary.txt";

		ProcessWords processor = new ProcessWords();
		processor.readFile(fileName);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the word length: ");
		int length = input.nextInt();
		
		ArrayList<String> sample = processor.getWordList(length);
		for(String word : sample) {
			System.out.println(word);
		}
		/*
		//TODO:
		 * Start with regular hangman
		 * prompt the user for the number of guesses - Daniel
		 * display the number of blanks to match the letters - AJ
		 * prompt the user to input a letter - Jordan Johnson
		 * check word for letter - Phillip
		 * update the word display with the letters they have guessed - Ross
		 * maintain and possibly display list of previously guessed letters - Jordan Jones
		 * if all blanks have been filled - user wins - Jack
		 * counter to keep up with incorrect guesses and if exceeds number of guesses from beginning, the player loses - Daniel
		 * loop to play again - Jordan Johnson
		 * 
		 * 
		 * Big Task: algorithm to change word based on user guesses to include a method for creating word families
		*/
	}

}
