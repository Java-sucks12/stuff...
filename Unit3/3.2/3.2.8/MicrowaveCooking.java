public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
       // between 0 and 60
       int num1 = (int) (Math.random() * 60);
       // Print the number of seconds
       System.out.println("Microwaving for " + num1 + " seconds");
       if (num1 > 20){
           System.out.println("Your roll will catch fire!");
       }
       else{
           System.out.println("Perfect cooking time!");
       }
       // Use two if statements to print
       // whether the roll is fine or will catch fire
    }
}
