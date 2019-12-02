import java.util.*;

public class ThreeStrings
{
    public static void main(String[] args)
    {
        
        Scanner input = new Scanner(System.in);
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();
        
        boolean bool1 = ((name1 + name2).equals(name3));
        
        if (bool1){
            System.out.println(name1 + " + " + name2 + " is equal to " + name3 + "!");
        }
        else{
            System.out.println(name1 + " + " + name2 + " is not equal to " + name3 + "!");
        }
        // Ask the user for three strings.
        // Use a Boolean variable to test the comparison of 
        // first+second equals third
        // Remember since you are working with strings to 
        // use equals() and NOT == !
    }
}
