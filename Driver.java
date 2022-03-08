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
		
		EvilHangman game = new EvilHangman(length);
		while(!game.checkWin()) {
			game.printWord();
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
	
		public int getnumofguesses() {
			Scanner reader = new Scanner(System.in);
			System.out.print("Enter a number of guesses : ") ;
			int numofguesses = reader.nextInt();
			return numofguesses;
		}

			//counter to keep up with incorrect guesses and if exceeds number of guesses from beginning, the player loses
		public Object incorectguesscounter(int numofguesses, object guess ) {
			int i =0;
			while (i < numofguesses) {
				Object guess;
				if ((boolean) (guess = false)) { 
					i ++;
				}
			}
			return null;
		}
}
	
	}

}
