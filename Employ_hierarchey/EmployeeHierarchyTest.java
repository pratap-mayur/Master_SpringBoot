package Employ_hierarchey;

public class EmployeeHierarchyTest {
    public static void main(String[] args) {
        Manager m = new Manager(12,"satish", 25000.0, "raja ji");
        m.displayDetails();
        Developer d = new Developer(134, "prakesh", 50000.0 ,2000);
        d.displayDetails();
    }
}
