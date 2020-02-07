public class PrintOdd 
{
    public static void main(String[] args)
    {
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
        printOddIndices(oddIndexArray);
    }
    
    public static void printOddIndices(int[] arr)
    {
        // your code goes here!
        try{
            for (int i=1; i<5; i+=2){
                System.out.println(arr[i]);
            }
        }
        catch (Exception e){
            return;
        }
        
        
        
    }
}
