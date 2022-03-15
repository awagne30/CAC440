
public class EvilHangman {

	private char[] wordToPrint;
	
	public EvilHangman(int length) {
		wordToPrint = new char[length];
		
		for(int i = 0; i < length; i++)
			wordToPrint[i] = '_';
	}
	
	public boolean checkWin(){
		for(int i = 0; i < wordToPrint.length; i++) { 
			if(wordToPrint[i] == '_') 
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

	public void printWord() {
		System.out.print(wordToPrint.toString());
	}
	public String[] findlongest(String[] familyList) {
		for( int i=0; i<= familyList.length; i++) {
			
			String longest = familyList[i];
			
			if (familyList[i+1].length() > longest.length()) {
				longest = familyList[i+1];
			}
		}
		return longest;
		
	}
	public static placeLetter(String[] largestGroup, String guessedLetter) {
        	List<String> placeLetterList = new ArrayList<String>();
        	for(String word : largestgroup){
		    if(word.contains(guessedLetter)) {
			for(String letter : word){
			    String onlyGuessedLetters = "";
			    if(letter.equals(guessedLetter)){
				onlyGuessedLetters = letter;
			    }
			    onlyGuessedLetters = "_";  
			}
			placeLetterList.add(onlyGuessedLetters)
		    }
		return placeLetterList
        	}
 	}
public ArrayList<String> sortWords(int wordLength, char guessedLetter, ArrayList<String> wordList) {
    HashMap<String,ArrayList<String>> wordFamilies = new HashMap<String,ArrayList<String>>();
    for(String word : wordList) {
     
      for(int i = 0; i < wordLength; i++) {
        //find patterns
       
        //replace wrong letters with -
       
      }
      //does pattern exist in arraylist
      ArrayList<String> wordFamily = wordFamilies.get(pattern);
      if(wordFamlily == null){
        wordFamily = new ArrayList<String>();
        wordFamily.add(word);
      }
      else
        wordFamily.add(word);
      wordFamilies.put(pattern,wordFamily);
    }
    return wordFamilies;
  }
}
