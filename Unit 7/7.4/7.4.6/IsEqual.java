import java.util.ArrayList;

public class RoadTrip
{
    // Create a GeoLocation and add it to the road trip
    private ArrayList<GeoLocation> stops;
    
    public RoadTrip(){
        stops = new ArrayList<GeoLocation>();
    }
    
    
    
    public void addStop(String name, double lat, double longitude){
        GeoLocation stop = new GeoLocation(name, lat, longitude);
        stops.add(stop);
    }
    
    // Get the total number of stops in the trip
    public int getNumberOfStops(){
        return stops.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength(){
        double length = 0;
        for (int i=0; i<stops.size() - 1; i++){
            GeoLocation start = stops.get(i);
            GeoLocation end = stops.get(i + 1);
            double distance = start.distanceFrom(end);
            length += distance;
        }
        return length;
        
    }
    
    // Return a formatted toString of the trip
    public String toString(){
        String result = "";
        
        for (int i=0; i<stops.size(); i++){
            GeoLocation cur = stops.get(i);
            result += (i+ 1) + ". " + cur + "\n";
        }
        return result;
    }
}
