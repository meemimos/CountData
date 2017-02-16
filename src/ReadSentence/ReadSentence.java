//Program it takes a sentence from user and counts no. of words, number of characters in the given sentence.

package ReadSentence;

import java.util.Scanner;

/**
 *
 * @author mimos
 */
public class ReadSentence {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        
        String data = scan.nextLine();
        
        System.out.println("Your sentence: " + data);
        System.out.println("No. of words: " + Count(data));
        System.out.println("No. of characters: " + data.length());
        
    }
    
    public static int Count(String str) {
        
        int wordCount = 0;
        boolean word = false;
        int endOfLine = str.length() -1;
        
        for (int i = 0; i < str.length(); i++) {
            
            if(Character.isLetter(str.charAt(i)) && i != endOfLine) {
                word = true;
            }
            else if(!Character.isLetter(str.charAt(i)) && word) {
                wordCount++;
                word = false;
            }
            else if(Character.isLetter(str.charAt(i)) && i == endOfLine) {
                wordCount++;
            }
            
        }
        return wordCount;
    }
    
}
