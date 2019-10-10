public class GamesTester
{
    public static void main(String[] args)
    {
        NumberGames game = new NumberGames(3);
        
        // Double the number
        // Print it out
        
        double dubbed = game.doubleNumber();
        System.out.println(dubbed);
        // Square the number
        // Print it out
        double rectangled = game.squareNumber();
        System.out.println(rectangled);
        // Double the number again
        // Print it out
        double dubbed2 = game.doubleNumber();
        System.out.println(dubbed2);
        // Get the number and store the value
        // Print it out to see that getNumber does
        // not modify the number
        double num1 = game.getNumber();
        System.out.println(num1);
    }
}
