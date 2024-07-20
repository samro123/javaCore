package intermediate;

import intermediate.bil.Employee;
import intermediate.bil.HumanResource;
import intermediate.bil.Manager;

public class Human {
    public static void main(String[] args) {
        HumanResource hr = new Employee();
        System.out.println("Employee : "+ hr.salary(2));
        hr = new Manager();
        System.out.println("Manager: "+ hr.salary(2));
    }
}
