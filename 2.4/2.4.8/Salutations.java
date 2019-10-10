public class Salutations
{
    // Put your code here
    public String name;
    
    public Salutations (String username){
        name = username;
    }
    
    public void addressLetter(){
        System.out.println("Dear " + name);
    }
    public void signLetter(){
        System.out.println("Sincerely " + name);
    }
    public void addressMemo(){
        System.out.println("To whom it may concern");
    }
    public void signMemo(){
        System.out.println("Best " + name);
    }
}
