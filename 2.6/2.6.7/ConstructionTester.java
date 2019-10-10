import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sales tax rate:");
        double tax = input.nextDouble();
        System.out.println("How many Boards do you need?");
        int board = input.nextInt();
        System.out.println("How many windows do you need?");
        int windows = input.nextInt();
        Construction stuff = new Construction(board, windows, tax);
        
        double boardCost = stuff.lumberCost(8);
        double winCost = stuff.windowCost(11);
        double total = winCost + boardCost;
        System.out.println("Total: " + total);
        System.out.println("Grand Total: " + stuff.grandTotal(total));
        
        
    }
}
