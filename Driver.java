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
		
		System.out.print("Enter a number of guesses : ") ;
		int numofguesses = reader.nextInt();
		
		ArrayList<String> sample = processor.getWordList(length);
		for(String word : sample) {
			System.out.println(word);
		}
		int incorrectGuesses = 0;
		
		EvilHangman game = new EvilHangman(length);
		while(!game.checkWin() && incorrectGuesses < numofguesses) {
			game.printWord();
			//Phillip's check word
			incorrectGuesses++;
			
		}
		/*
		//TODO:
		 * Start with regular hangman
		 * prompt the user for the number of guesses - Daniel
		 * update the word display with the letters they have guessed
		 * maintain and possibly display list of previously guessed letters
		 * counter to keep up with incorrect guesses and if exceeds number of guesses from beginning, the player loses
		 * loop to play again
		 * 
		 * 
		 * Big Task: algorithm to change word based on user guesses to include a method for creating word families
		*/


}
	
	}

}
