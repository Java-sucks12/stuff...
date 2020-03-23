import java.util.ArrayList;

public class DataPurge
{
    public static void removeDuplicates(ArrayList<String> list){
        for (int i=0; i< list.size(); i++){
            String email = list.get(i);
            for (int next=i+1; next<list.size(); next++){
                if(list.get(next).equals(email)){
                System.out.println("Duplicate " + list.get(next) + " removed");
                list.remove(next);
                next--;
                }
            }
        }
    }
    
    public static void removeAOL(ArrayList<String> list){
        for (int i=0; i<list.size(); i++){
            String email = list.get(i);
            if(email.contains("aol.com")){
                System.out.println("Remove email: " + email);
                list.remove(i);
                i--;
            }
        }
    }
    
    public static boolean containsOnlyEmails(ArrayList<String> list){
        boolean allEmails = true;
        for(int i=0; i<list.size(); i++){
            String email = list.get(i);
            if(!email.contains("@") || !email.contains(".")){
                allEmails = false;
            }
        }
        return allEmails;
    }
}
