public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater something = new Rater("Company1", 2);
        something.updateReview();
        something.setRating(4);
        something.updateReview();
        String fin = something.toString();
    }
}
