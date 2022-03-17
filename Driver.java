import java.util.ArrayList;
import java.util.Collections;
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
		
		System.out.print("Enter a number of guesses: ") ;
		int numofguesses = input.nextInt();
		
		ArrayList<String> sample = processor.getWordList(length);

		int incorrectGuesses = 0;
		ArrayList<Character> guesses = new ArrayList<Character>();
		EvilHangman game = new EvilHangman(length);
		ArrayList<String> words = sample;
		System.out.println("Word to guess: " + game.getPattern());
		while(!game.checkWin() && incorrectGuesses < numofguesses) {
			Collections.sort(guesses);
			System.out.println("Letters guessed: " + guesses.toString());
			System.out.print("Input a character: ");    
			char letterGuessed = input.next().charAt(0);   
			

			while (guesses.contains(letterGuessed)) {
				System.out.println("You already guessed that");
				System.out.print("Input a character: ");   
				letterGuessed = input.next().charAt(0);  
			}
			
			guesses.add(letterGuessed);
			//Find word families
			//Find the largest list
			words = game.findlongest(game.sortWords(letterGuessed, words));
			//Display the new word
			System.out.println("Word to guess: " + game.getPattern());

			  incorrectGuesses++;
		}
		if(game.checkWin())
			System.out.println("You nailed it!");
		else
			System.out.println("You failed it!");

		}
	}

