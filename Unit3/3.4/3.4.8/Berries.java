import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        // Ask for a berry initial
        
        System.out.println("Enter the initial of the berry:");
        Scanner input = new Scanner(System.in);
        String letter = input.nextLine();
        char le = letter.charAt(0);
        
        if (le == 'r'){
            System.out.println("You ordered raspberry");
        }
        else if (le == 'h'){
            System.out.println("You ordered huckleberry");
        }
        else if (le == 'g'){
            System.out.println("You ordered gogiberry");
        }
        else{
            System.out.println("Berry not recognized");
        }
        
        // To get the input as a character, use the String method
        // charAt().  Use str.charAt(0) since you want the
        // first character
        
        
        // Now you can compare characters using ==
        
        // Use comments to list the different
        // branches you will need before you write the code
    }
}
