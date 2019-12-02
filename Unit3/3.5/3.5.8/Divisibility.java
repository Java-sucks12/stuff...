import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int divi = input.nextInt();
        
        System.out.print("Enter the divisor: ");
        int dive = input.nextInt();
        if (dive != 0 && divi % dive == 0){
            System.out.println(divi + " is divisible by " + dive + "!");
        }
        else{
            System.out.println(divi + " is not divisible by " + dive + "!");
        }
    }
}
