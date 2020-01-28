public class Routine
{
    private double sleep;
    private double fun;
    private double school;
    private double sports;
    
    public Routine(){
        sleep = 0;
        fun = 0;
        school = 0;
        sports = 0;
    }
    public void setSleep(double s){
        sleep = s;
    }
    public void setFun(double f){
        fun = f;
    }
    public void setSchool(double s){
        school = s;
    }
    public void setSports(double s){
        sports = s;
    }
    public void printTotal(){
        double total = sleep * 7 + fun * 7 + school * 7 + sports*7;
        double left = (24 *7) - total;
        System.out.println("Weekly Totals");
        System.out.println("Sleep: " + sleep * 7);
        System.out.println("School: " + school * 7);
        System.out.println("Sports: " + sports * 7);
        System.out.println("Fun: " + fun * 7);
        System.out.println("Grand Total: " + total);
        System.out.println("Hours left over: " + left);
    }
    
    
    
}
