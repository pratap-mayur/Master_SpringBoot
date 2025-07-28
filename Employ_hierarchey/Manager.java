package Employ_hierarchey;

public class Manager extends Employee{
    private String projectName;

    Manager(int id, String name, double salary, String projectName){
        super(id,name,salary);
        this.projectName =projectName;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("projectName: "+projectName);
    }
}
