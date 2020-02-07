public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] strings = {"Welcome", "to", "the snap shot", "app!"};
        
        for (int i=0; i<4; i++){
            System.out.println(strings[i]);
        }
        System.out.println("");
        
        strings[0] = "Upgrade";
        strings[3] = "premium app!";
        for (int i=0; i<4; i++){
            System.out.println(strings[i]);
        }
    }
}
