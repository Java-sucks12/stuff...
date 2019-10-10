public class WebsiteTester
{
    public static void main(String[] args)
    {
        // Start here!
        Website first = new Website();
        Website second = new Website("goodSchool", "edu");
        Website last = new Website("codehs", "com", 1000000);
        System.out.println(first);
        System.out.println(second);
        System.out.println(last);
    }
}
