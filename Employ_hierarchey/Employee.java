package Employ_hierarchey;

public class Employee {
    protected int id;
    protected String name;
    protected double salary;

    Employee(int id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
    }

}
