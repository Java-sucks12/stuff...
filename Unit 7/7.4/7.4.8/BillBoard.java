import java.util.ArrayList;
public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<Musician>();
 
    public void add(Musician name){
        if (name.getIsPlatinum() && top10.size() < 10){
            top10.add(name);
        }
        else if(name.getIsPlatinum() && top10.size()==10){
            replace(name);
        }
        else{
            System.out.println("Sorry, " + name.getName() + " does not qualify for Top 10");
        }
    }
 
    public void replace(Musician singer){
        int min = top10.get(0).getWeeksInTop40();
        int minIndex = 0;
        for (int i=0; i<top10.size(); i++){
            int numWeeksTop40 = top10.get(i).getWeeksInTop40();
            if(numWeeksTop40 < min){
                min = numWeeksTop40;
                minIndex = i;
            }
        }
        if (min< singer.getWeeksInTop40()){
            System.out.println("The musician " + top10.get(minIndex).getName() + " has been replaced by " + singer.getName() + ".");
            top10.set(minIndex, singer);
        }
        else{
            System.out.println("Sorry, " + singer.getName() + " has less weeks in the Top 40 than the other musicians.");
        }
    }
 
 
    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}
