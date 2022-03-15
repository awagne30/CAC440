
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EvilHangman {

	private char[] wordToPrint;
	private String currentPattern;
	
	public EvilHangman(int length) {
		wordToPrint = new char[length];
		
		for(int i = 0; i < length; i++)
			wordToPrint[i] = '_';
		currentPattern = String.copyValueOf(wordToPrint);
		
	}
	
	public boolean checkWin(){
		for(int i = 0; i < currentPattern.length(); i++) { 
			if(currentPattern.charAt(i) == '_') 
				return false; 
		}
		return true; 
	}
	
	public boolean compareLetters(char guessedLetter) {
    		for (char letter : wordToPrint) {
      			if (guessedLetter == letter) 
        			return true;
		}
        	return false; 
    	}
/*
	public void printWord() {
		System.out.print(wordToPrint.toString());
	}
	*/
	public ArrayList<String> findlongest(HashMap<String,ArrayList<String>> familyList) {
		ArrayList<String> longest = null;
		int count = 0;
		for(String key : familyList.keySet()) {
			
			if(familyList.get(key).size() > count) {
				longest = familyList.get(key);
				count = longest.size();
				currentPattern = key;
			}
		}
		return longest;
	}
	/*
	public void placeLetter(String guessedLetter) {
        	List<String> placeLetterList = new ArrayList<String>();
        	for(String word : largestGroup){
        		if(word.contains(guessedLetter)) {
        			for(char letter : word.){
        				String onlyGuessedLetters = "";
        				if(letter.equals(guessedLetter)){
        					onlyGuessedLetters = letter;
        				}
        				onlyGuessedLetters = "_";  
        			}
        			placeLetterList.add(onlyGuessedLetters)
        		}
        		return placeLetterList;
        	}
 		}
	*/
	public HashMap<String,ArrayList<String>> sortWords(char guessedLetter, ArrayList<String> wordList) {
	    HashMap<String,ArrayList<String>> wordFamilies = new HashMap<String,ArrayList<String>>();
	    for(String word : wordList) {
	    	char[] letters = word.toCharArray();
	    	String pattern = "";
	    	for(int i = 0; i < word.length(); i++) {
	    	  //find patterns
	    	  if(word.charAt(i) != guessedLetter)
	    		pattern += currentPattern.charAt(i);
	    	  else
	    		  pattern += guessedLetter;
	    	}
	    	
	      //does pattern exist in arraylist
	      ArrayList<String> wordFamily = wordFamilies.get(pattern);
	      if(wordFamily == null){
	        wordFamily = new ArrayList<String>();
	        wordFamily.add(word);
	        wordFamilies.put(pattern, wordFamily);
	      }
	      else {
	        wordFamily.add(word);
	      wordFamilies.put(pattern,wordFamily);
	      }
	    }
    	System.out.println("Patterns:" + wordFamilies.keySet().toString());
	    return wordFamilies;
	  }
	
	public String getPattern() {
		return currentPattern;
	}
}


