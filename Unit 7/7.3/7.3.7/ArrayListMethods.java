import java.util.ArrayList;
public class ArrayListMethods
{
    public static void print(ArrayList<String> arr){
        for (int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }
    
    public static void condense(ArrayList<String> arr){
        int i=0;
        while (i < arr.size()){
            if (!(i == arr.size()- 1)){
                String sum = arr.remove(i);
                String sum2 = arr.get(i);
                arr.set(i, sum + sum2);
            }
            i++;
        }
    }
    
    public static void duplicate(ArrayList<String> arr){
        for (int i=0; i<arr.size(); i++){
            arr.add(i+ 1, arr.get(i));
            i++;
        }
    }
}
