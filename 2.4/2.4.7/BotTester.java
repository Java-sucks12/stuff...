import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        System.out.println("Hello. What is your name?");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        Bot hal = new Bot(username);
        hal.greeting();
        hal.help();
        System.out.println(" What's the weather like?");
        hal.weather();
        System.out.println("How many feet in a mile?");
        hal.feetInMile();
        hal.goodbye();
    }
}
