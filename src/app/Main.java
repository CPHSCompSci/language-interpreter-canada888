package app;

import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
	  
	Scanner input = new Scanner(System.in);
	Scanner answer = new Scanner(System.in);
	int a = 0;
	do {
		int ans = 0;
		
		System.out.println("Would you like to translate a word or decode a word? (enter 1 to decode or enter 2 to translate)" );
		ans = answer.nextInt();
		
		if(ans == 1)
		{
			System.out.println("What word or phrase would you like to decode?");
			String word = input.nextLine();
			System.out.println("Decoded word: " + decodeInput(word));
			//System.out.println();
		}
		else if(ans == 2)
		{
			System.out.println("What word or phrase would you like to translate?");
			String wordTrans = input.nextLine();
			System.out.println("Translated word: " + encodeInput(wordTrans));//uj
			System.out.println();			
		}
	
	
	System.out.println("Would you like to decode or translate another word? (Enter 1 for yes or 0 for no)");
	a = answer.nextInt();
	//System.out.println();
	
	}while(a == 1);
	System.out.println();



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
	  
	  for(int k = 0; k <= 100; k++)
	  {
		if(word.contains("ent") || word.contains("ingy"))
			startEnt = word.indexOf("ent");
			endEnt = startEnt + 3;
			newWordEnt = word.substring(0, startEnt) + word.substring(endEnt, word.length());
			
			if(word.contains("ingy"))
				startIngy = newWordEnt.indexOf("ingy");
				endIngy = startIngy + 4;
				newWordIngy = newWordEnt.substring(0, startIngy) + word.substring(endIngy, newWordEnt.length());
				
				word = newWordIngy;
		}
			return word; */
	  String newWord ="";
	  
	  for(int i = 0; i <= 10; i ++)
	  {
	  newWord = word.replace("ingy", "");
	  newWord = newWord.replace("ent", "");
	  
	  }
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
	
	Lexicon lex = new Lexicon();  
	String newWordTranslated = lex.translate(word);
	
	return newWordTranslated;
	
    //return Lexicon.translate(word);
  }
}