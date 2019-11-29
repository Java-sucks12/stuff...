import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for the three stats
        System.out.println("How many points did you score?");
        int num1 = input.nextInt();
        System.out.println("How many rebounds did you get?");
        int num2 = input.nextInt();
        System.out.println("How many assists did you have?");
        int num3 = input.nextInt();
        // Create three boolean variables that
        boolean answer1 = (num1 >= 10);
        boolean answer2 = (num2 >= 10);
        boolean answer3 = (num3 >= 10);
        // check if the stats are 10 or more
        System.out.println("You got 10 or more points: " + answer1);
        System.out.println("You got 10 or more rebounds: " + answer2);
        System.out.println("You got 10 or more assists: " + answer3);
        // Print out the value of each boolean
        // variable.  Be sure to label them!
        
        
    }
}
