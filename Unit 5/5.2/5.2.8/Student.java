public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * Constructors go here.
     * Copy over your constructors from the previous exercise. 
     * Check out StudentTester.java for an example of how to use
     * this constructor. Make sure your code matches the call in the
     * tester.
     */
      public Student(String fn, String ln, int gl, String s){
       firstName = fn;
       lastName = ln;
       gradeLevel = gl;
       school = s;
   }
   
   public Student(String fn, String ln, int gl){
       firstName = fn;
       lastName = ln;
       gradeLevel = gl;
       if (gl >= 9 && gl <=12){
           school = "high school";
       }
       else if (gl >= 6 && gl <= 8){
           school = "middle school";
       }
       else{
           school = "elementary school";
       }
   }
   
   
   public String getFirstName(){
        return firstName;
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     * 
     * Modify the to string to add 'and goes to _____' at the end
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel + " and goes to " + school;
    }
}
