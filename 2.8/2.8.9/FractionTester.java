import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        
        // Ask for input
        System.out.println("Enter the numerator:");
        int num1 = input.nextInt();
        System.out.println("Enter the denominator: ");
        int num2 = input.nextInt();
        // Create a new Fraction with the user's input
        Fraction frac = new Fraction(num1, num2);
        
        
        System.out.println("1/2 + 3/4 = 10/8");
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        
        
    }
}
