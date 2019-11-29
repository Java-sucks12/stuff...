import java.util.Scanner;

public class Basketball
{
    public static boolean check(String nm1, String nm2){
        String alphabet = "ABCDEFGHIJKLMNAOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int index = 0;
        int index2 = 0;
        
        for (int i=0; i < alphabet.length(); i++){
            if (nm1.charAt(0) == alphabet.charAt(i)){
                index = i;
            }
            if (nm2.charAt(0) == alphabet.charAt(i)){
                index2 = i;
            }
        }
        if (index >= index2){
            return true;
        }
        return false;
    }
    
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        
        System.out.println("Enter player one's name:");
        String name1 = input.nextLine();
        System.out.println("Enter player two's name:");
        String name2 = input.nextLine();
        System.out.println("Enter " + name1 + "'s score");
        int score1 = input.nextInt();
        System.out.println("Enter " + name2 + "'s score");
        int score2 = input.nextInt();
        
        if (check(name1, name2)){
            System.out.println(name2 + " scored " + score2 + " points");
            System.out.println(name1 + " scored " + score1 + " points");
        }
        else{
            System.out.println(name1 + " scored " + score1 + " points");
            System.out.println(name2 + " scored " + score2 + " points");
        }
        
        
        if (score1 > score2){
            System.out.println(name1 + " wins!");
        }
        else{
            System.out.println(name2 + " wins!");
        }
        
    }
}
