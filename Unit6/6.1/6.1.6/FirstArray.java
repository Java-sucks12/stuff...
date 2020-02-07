public class FirstArray
{
    public static void print(String args){
        System.out.println(args);
    }
    
    public static void main(String[] args)
    {
      // Create the 3 arrays here
        String[] cities = {"Las Vegas", "Minsk", "Sao Paulo"};
        int[] temp = {104, 73, 80};
        double[] water = {4.17, 26.7, 55.0};
      // Print all 3 arrays according to the output in the description
      for (int i=0; i<3; i++){
          print(cities[i] + " has an average annual precipitation of " + water[i] + " inches.");
          print(cities[i] + " has an average annual high temp of " + temp[i] + " degrees Fahrenheit.");
      }
    }
}
