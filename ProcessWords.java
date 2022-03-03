import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ProcessWords {

	private HashMap<Integer,ArrayList<String>> wordList;
	
	public ProcessWords() {
		wordList = new HashMap<Integer,ArrayList<String>>();
	}
	
	private void storeWord(String word) {
		int length = word.length();
		ArrayList existingWords = wordList.get(length);
		if(existingWords == null) {
			existingWords = new ArrayList<String>();
			existingWords.add(word);
		}
		else 
			existingWords.add(word);
		wordList.put(length, existingWords);
	}
	
	public void readFile(String fileName) {
	 try {
	      File myObj = new File(fileName);
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        storeWord(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	}
	
	public ArrayList<String> getWordList(int length) {
		return wordList.get(length);
	}
}
