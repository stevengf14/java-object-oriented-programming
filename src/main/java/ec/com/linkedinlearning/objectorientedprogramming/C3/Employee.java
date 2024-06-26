package ec.com.linkedinlearning.objectorientedprogramming.C3;

/**
 *
 * @author Steve
 */
public class Employee extends Person {

    protected double salary;

    public Employee(String name, double salary, int age) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary() {
        this.salary *= 1.2;
    }
}
