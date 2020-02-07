public class PrintArray
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"a", "b", "c"};
        printArr(arr);
    }
    
    public static void printArr(String[] arr)
    {
        // Print everything in the array on its own line
        try{
            for (int i=0; i<3; i++){
                print(arr[i]);
            }
        }
        catch (Exception e){
            return;
        }

    }
    public static void print(String a){
        System.out.println(a);
    }
}
