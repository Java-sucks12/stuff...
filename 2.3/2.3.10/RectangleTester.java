public class RectangleTester
{
    public static void main(String[] args)
    {
        // Fix this code so there are no more
        // null pointer exceptions
        Rectangle brick = new Rectangle(1,1);
        Rectangle fencePost = new Rectangle(1, 3);
        
        System.out.println(brick);
        System.out.println(fencePost);
        
        // Change the fencePost dimensions
        fencePost = new Rectangle(1, 5);
        System.out.println(fencePost);
        
    }
}
