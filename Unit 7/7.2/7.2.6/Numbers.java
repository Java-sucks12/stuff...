import java.util.ArrayList;

public class Numbers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        // Add 5 numbers to `numbers`
        for (int i=1; i<=5; i++){
            numbers.add(i);
        }
        // Print out the first element in `numbers`
        System.out.println(numbers.get(0));
    }
}
