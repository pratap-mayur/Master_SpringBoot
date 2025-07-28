import java.util.*;
class gpa{
    private String name;
    private double[] grades;

    gpa(String name,double[] grades){
        this.name = name;
        this.grades = grades;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double[] getGrades() {
        return grades;
    }

    public double calculate(){
        if (grades == null || grades.length == 0) {
            return 0.0;
        }
        double sum = 0;
        for(double grade:grades){
            sum+=grade;
        }
        return sum/grades.length;
    }
}
public class GPA_cal{
    public static void main(String[] args) {
        double[] grades = {85.5, 90.0, 78.0, 92.5};
        gpa student = new gpa("Alice", grades);

        System.out.println("Student: " + student.getName());
        System.out.println("GPA: " + student.calculate());
        System.out.println("GPA: " + student);
    }
}