
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
}
