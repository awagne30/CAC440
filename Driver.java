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
		SortedSet<Character> guesses = new SortedSet<Character>();
		EvilHangman game = new EvilHangman(length);
		while(!game.checkWin() && incorrectGuesses < numofguesses) {
			game.printWord();
			System.out.print("Input a character: ");  
			// reading a character   
			char letterGuessed = input.next().charAt(0);   
			System.out.println("You have entered " + c);  
			
			System.out.println("guessed : " + hangman.guesses())
			if (hangman.guesses().contains(c)) 
				System.out.println("You already guessed that")
			if(game.compareLetters(letterGuessed)
				game.updateLetters(letterGuessed)	
			else
				incorrectGuesses++;
			  
		}
		/*
		//TODO:
		 * word families
		 * choose subset with largest number of words
		*/


		}
	
	}

}
