package Employ_hierarchey;

public class Developer extends Employee {
    private double bonus;

    Developer(int id, String name, Double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Bonus:"+bonus);
    }
}
