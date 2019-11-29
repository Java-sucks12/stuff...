import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        // Ask for two numbers
        System.out.println("Enter two numbers:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        // Compare the numbers as instructed
        boolean answer1 = (num1 == num2);
        boolean answer2 = (num1 < num2);
        boolean answer3 = (num1 > num2);
        // Display the results
        System.out.println(num1 + " < " + num2 + ": " + answer2);
        System.out.println(num1 + " == " + num2 + ": " + answer1);
        System.out.println(num1 + " > " + num2 + ": " + answer3);
    }
}
