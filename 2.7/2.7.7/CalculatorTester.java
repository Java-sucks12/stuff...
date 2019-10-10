import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments to remind yourself 
        // what you need to do
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two doubles");
        Calculator calc = new Calculator();
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double sum = calc.sum(num1, num2);
        double difference = calc.subtract(num1, num2);
        double product = calc.multiply(num1, num2);
        double quotient = calc.divide(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
    }
}
