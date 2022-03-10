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
	}
	//update the word display with the letters they have guessed - Ross
	//args: user inputted letters
	public static displayGuessedLetters(String letter) {
		
		List<String> guessedLetters = new ArrayList<>(Arrays.asList(strArray));
       
        guessedLetters.add(letter);
		System.out.println("Letters that have been guessed: ");
          for(String val : guessedLetters){
          System.out.print(val + " ");
		}
		//return array guessedLetters to be used by other members?
	}


	public static placeLetter(String[] largestGroup, String guessedLetter) {
		List<String> placeLetter = new ArrayList<String>();
		for(String word : largestgroup){
			if(word.contains(guessedLetter)) {
				for(String letter : word){
					String onlyGuessedLetters = null;
					if(letter == guessedLetter){
						onlyGuessedLetters = letter;
					}
					onlyGuessedLetters = '_';
				placeLetter.add(onlyGuessedLetters)
				}
			}
		}
	}
		/*
		//TODO:
		 * Start with regular hangman
		 * prompt the user for the number of guesses - Daniel
		 * display the number of blanks to match the letters - AJ
		 * prompt the user to input a letter - Jordan Johnson
		 * check word for letter - Phillip
		 * update the word display with the letters they have guessed if they match - Ross
		 * maintain and possibly display list of previously guessed letters - Jordan Jones
		 * if all blanks have been filled - user wins - Jack
		 * counter to keep up with incorrect guesses and if exceeds number of guesses from beginning, the player loses - Daniel
		 * loop to play again - Jordan Johnson
		 * 
		 * Big Task: algorithm to change word based on user guesses to include a method for creating word families
		*/
	

}
