package app;

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
	  
	Scanner input = new Scanner(System.in);
	
	System.out.println("What word would you like to decode?");
	String word = input.nextLine();
	
	
	
    Lexicon lex = new Lexicon();

    String newWord = lex.translate("Hot");
    System.out.println(lex.getSample(6));
    System.out.println(decodeMessage(lex.getSample(6)));

  }

  /**
   * This method decodes a single word.
   * 
   * @param word The single word to be decoded.
   */
  public static String decode(String word)
  {
	 /* int startEnt = 0;
	  int endEnt = 0;
	  String newWordEnt = "";
	  String newWordIngy = "";
	  
	  int startIngy = 0;
	  int endIngy = 0;
	
		if(word.contains("ent") || word.contains("ingy"))
			startEnt = word.indexOf("ent");
			endEnt = startEnt + 3;
			newWordEnt = word.substring(0, startEnt) + word.substring(endEnt, word.length());
			
			if(word.contains("ingy"))
				startIngy = newWordEnt.indexOf("ingy");
				endIngy = startIngy + 4;
				newWordIngy = newWordEnt.substring(0, startIngy) + word.substring(endIngy, newWordEnt.length());
			
			return newWordIngy; */
	  String newWord = word.replace("ingy", "");
	  newWord = newWord.replace("ent", "");
	  
	  return newWord;
    
  }

  /**
   * This method should not have code copy/pasted from the decode method.
   * 
   * @param message The sentence (multiple words) to be decoded.
   */
  public static String decodeMessage(String message)
  {
	  /*String newMessage = "";
	  for(int i = 0; i <= 30; i++)
	  {
		 newMessage = decode(message);
	  } */
	  
	  String newMessage = decode(message);
	  return newMessage;
  }

  /**
   * This method uses the decode(String) and a Scanner to decode a word specified
   * by the user.
   */
  public static String decodeInput(String word) {
	
    return decode(word);
  }
  
  /**
   * This method uses the Lexicon translate(String) and a Scanner to encode a word specified
   * by the user.
   */
  public static String encodeInput(String word) {
	Lexicon newLex = new Lexicon();
	
	
	
    //return Lexicon.translate(word);
  }
}