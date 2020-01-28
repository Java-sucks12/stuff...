public class Dog
{
    private String name;
    private int age;
    private double weight;

    // Add your constructors here
    
    public Dog(String n, int a, double w){
        name = n;
        age = a;
        weight = w;
    }
    public Dog(String n, int a){
        name = n;
        age = a;
    }

    public String toString(){
        return "Name: " + name + "\nWeight: " + weight +  "\nAge: " + age;
    }
}
