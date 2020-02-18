public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    public Student getMostImprovedStudent()
    {
    // your code goes here! 
    Student mostImproved = this.students[0];
    for (int i=0; i< this.numStudentsAdded; i++){
        if(this.students[i].getExamRange()>mostImproved.getExamRange()){
            mostImproved = this.students[i];
        }
    }
    return mostImproved;
    
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
