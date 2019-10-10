public class PlayerTester
{
    public static void main(String[] args) {
       
       //Start here
       BasketballPlayer ladu = new BasketballPlayer("Ladu", "The Lakudus");
       BasketballPlayer omar = new BasketballPlayer("Omar");
       ladu.addGame(10, 1);
       ladu.addGame(14, 1);
       ladu.addGame(76, 9);
       ladu.addGame(100, 8);
       omar.addGame(0, 1);
       omar.addGame(1, 3);
       omar.addGame(2, 5);
       omar.addGame(1, 7);
       System.out.println("Ladu's Stats:");
       System.out.println(ladu);
       ladu.printPPG();
       ladu.printAPG();
       System.out.println("Omar's Stats:");
       omar.printPPG();
       omar.printAPG();
       System.out.println(omar);
       
       
       
       
       
    }
}
