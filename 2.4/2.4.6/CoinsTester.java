public class CoinTester
{
    public static void main(String[] args) {

       //Create your program here
       Coins change = new Coins(4, 3, 2, 1);
       change.bankValue();
       change.addQuarter();
       change.addQuarter();
       change.addDime();
       change.addDime();
       change.addPenny();
       change.bankCount();
       change.bankValue();
    }
}
