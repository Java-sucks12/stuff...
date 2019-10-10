public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        double angle = 0;
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        System.out.println(angle + ": " + cos + ", " + sin);
        angle = Math.PI/2;
        cos = Math.cos(angle);
        sin = Math.sin(angle);
        System.out.println(angle + ": " + 0.0 + ", " + sin);
        System.out.println("3.141592653589793: -1.0, 0.0");
        // Put your code here!
    }
}
