import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        System.out.println("Enter two doubles");
        Calculator a = new Calculator();
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        a.sum(num1, num2);
        a.subtract(num1, num2);
        a.multiply(num1, num2);
        a.divide(num1, num2);
        
        
        
    }
}
