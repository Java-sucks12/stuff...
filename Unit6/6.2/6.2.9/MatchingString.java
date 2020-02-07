public class MatchingString
{

    private static String[] arr = {"Hello", "Karel", "CodeHS!"};
    
    public static int findString(String myString)
    {
        // your code goes here!
        for (int i=0; i<3; i++){
            if (arr[i].equals(myString)){
                return i;
            }
        }
        return -1;
    }
}
