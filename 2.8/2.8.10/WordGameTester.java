import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word: ");
        String userword = input.nextLine();
        
        WordGames game = new WordGames(userword);
        // Scramble it
        // Print out scrambled word
        System.out.println(game.scramble());
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an index: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word = input.nextLine();
        System.out.println(game.bananaSplit(idx, word));
        // Add random word at index
        // Print out the word
        
        
        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        
        
        
    }
}
