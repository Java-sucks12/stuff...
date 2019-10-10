import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the latitude of the starting location: ");
        double latitude = input.nextDouble();
        System.out.print("\nEnter the longitude of the starting location: ");
        double longitude = input.nextDouble();
        
        GeoLocation start = new GeoLocation(latitude, longitude);
        
        System.out.print("\nEnter the latitude of the ending location: ");
        double latend = input.nextDouble();
        System.out.print("\nEnter the longitude of the ending location: ");
        double longend = input.nextDouble();
        GeoLocation end = new GeoLocation(latend, longend);
        double x = start.distanceFrom(end);
        System.out.println("The distance is " + x + " miles.");
    }
}
