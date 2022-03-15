import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.SortedSet;

public class Driver {

	public static void main(String[] args) {
		String fileName = "EvilHangman/dictionary.txt";

		ProcessWords processor = new ProcessWords();
		processor.readFile(fileName);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the word length: ");
		int length = input.nextInt();
		
		System.out.print("Enter a number of guesses : ") ;
		int numofguesses = input.nextInt();
		
		ArrayList<String> sample = processor.getWordList(length);
		/*
		for(String word : sample) {
			System.out.println(word);
		}*/
		int incorrectGuesses = 0;
		ArrayList<Character> guesses = new ArrayList<Character>();
		EvilHangman game = new EvilHangman(length);
		ArrayList<String> words = sample;
		while(!game.checkWin() && incorrectGuesses < numofguesses) {
			//game.printWord();
			System.out.print("Input a character: ");  
			// reading a character   
			char letterGuessed = input.next().charAt(0);   
			System.out.println("You have entered " + letterGuessed);  
			
			System.out.println("guessed : " + guesses.toString());
			guesses.add(letterGuessed);
			if (guesses.contains(letterGuessed)) 
				System.out.println("You already guessed that");
			//Find word families
			//Find the largest list
			words = game.findlongest(game.sortWords(letterGuessed, words));
			//Display the new word
			System.out.println("Pattern: " + game.getPattern());
			System.out.println(words.toString());
			/*
			if(game.compareLetters(letterGuessed))
				game.placeLetter(letterGuessed);	
			else
				incorrectGuesses++;
				*/
			  incorrectGuesses++;
		}


		}
	
	}
