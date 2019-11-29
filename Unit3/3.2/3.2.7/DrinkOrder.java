import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start here!
        System.out.println("What do you want to drink?");
        String drink = input.nextLine();
        System.out.println("How many teaspoons of sugar do you want?");
        int sugar = input.nextInt();
        // You'll find it helpful to list the steps you
        if (sugar > 0){
            System.out.println("Confirming your order. You wanted:");
            System.out.println(drink + " with sugar");
        }
        else{
            System.out.println("Confirming your order. You wanted:");
            System.out.println(drink);
        }
        // need to take, then write the code
    }
}
