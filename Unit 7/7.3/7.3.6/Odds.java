import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for(int index = 1; index <101; index++)
        {
            odds.add(index);
        }
        removeEvens(odds);
        //call removeEvens on the array above!
    }
    
    public static void removeEvens(ArrayList<Integer> array)
    {
        for (int i=0; i< array.size(); i++){
            if (array.get(i) % 2 ==0){
                array.remove(i);
                i--;
            }
        }
        for (int i=0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
