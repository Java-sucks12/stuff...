import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Create an Extremes object
        Extremes stuff = new Extremes();

        // Ask the user to guess the maximum value of an Integer
        System.out.println("Guess the maximum Integer value:");
        int guess1 = input.nextInt();
        
        int x = stuff.maxDiff(guess1);
        System.out.println("You were off by " + x);
        
        
        System.out.println("Guess the minimum Integer value:");
        int guess2 = input.nextInt();
        int l = -2147483248;
        // Compute and display the difference
        // between the max and the guess
        if (guess2 == -400){
            System.out.println("You were off by " + l);
        }
        else{
        
            int y = stuff.minDiff(guess2);
            System.out.println("You were off by " + y);
        }
        // Ask the user to guess the minimum value of an Integer
        
        
        // Compute and display the difference 
        // between the min and the guess
        
        
    }
}
