package ec.com.linkedinlearning.objectorientedprogramming.C1;

/**
 *
 * @author Steve
 */
public class Employee {

    public String name;
    public int age;
    public double salary;
    public String location;

    public Employee(String name, int age, double salary, String location) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.location = location;
    }

    public void raiseSalary(double amount) {
        this.salary += amount;
    }
}
