public class DistanceTester
{
    
    public static void print(String[] args){
        System.out.println(args);
    }
    
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance d1 = new Distance(5);
        Distance d2 = new Distance(10);
        Distance d3 = new Distance(12);
        
        
        
        
        // Convert one to yards, one to kilometers,
        System.out.println(d1.toYards());
        System.out.println(d2.toKilometers());
        System.out.println(d3.toFeet());
        // and the last one to feet
        
        // Print out the converted values
    }
}
