public class Fraction
{
    // Create your instance variables and constructor here
    private int numerator;
    private int denominator;
    
    public Fraction(int num, int den){
        numerator = num;
        denominator = den;
    }
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return numerator;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return denominator;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        numerator = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        denominator = x;
    }
    
    public void add(Fraction other) {
        // IMPLEMENT THIS METHOD
        this.numerator = this.numerator * other.getDenominator() + this.denominator * other.getNumerator();
        this.denominator *= other.getDenominator();
    }
    
    public void subtract(Fraction other) {
        // IMPLEMENT THIS METHOD
        this.numerator = this.numerator * other.getDenominator() - this.denominator * other.getNumerator();
        this.denominator *= other.getDenominator();
    }
    
    public void multiply(Fraction other) {
        // IMPLEMENT THIS METHOD
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return "";
        
        
    }
}
