import java.util.*;
public class LastMultipleofThree
{

    public static void main(String[] args)
    {
        int[] numbers1 = {76, 75, 3, 17, 12, 22, 7};
        System.out.print("The following index holds the LAST multiple of 3: " + findMultipleOfThree(numbers1));
        
    }
    
    public static int findMultipleOfThree(int[] arr)
    {
        // your code goes here! 
        int index = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] % 3 == 0){
                index = i;
            }
        }
        if (index == 0){
            return -1;
        }
        return index;
        
        
    }
}
