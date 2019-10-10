import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       //Start Here!
       Scanner input = new Scanner(System.in);
       String username = input.nextLine();
       Bot2 robot = new Bot2(username);
       robot.greeting();
       System.out.println("What is your favorite animal?");
       String creature = input.nextLine();
       robot.favoriteAnimal(creature);
       System.out.println("Where do you live?");
       String house = input.nextLine();
       robot.home(house);
       int num1 = input.nextInt();
       robot.favoriteNumber(num1);
       robot.goodbye();
    }
}
