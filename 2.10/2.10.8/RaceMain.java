public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double a = 9.8;
        Racecar car = new Racecar(a, "Human");
        
        // Create two Racecar objects
        Racecar car2 = new Racecar(a, "car");
        
        // Compute the finishing times for both cars
        double num1 = car.computeTime(distance);
        double num2 = car.computeTime(distance);
        // Print times of each car
        System.out.println("First car finished in " + num1 + " seconds");
        System.out.println("First car finished in " + num2 + " seconds");
    }
}
