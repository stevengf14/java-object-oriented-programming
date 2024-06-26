package ec.com.linkedinlearning.objectorientedprogramming.C3;

/**
 *
 * @author Steve
 */
public class Salesperson extends Employee {

    private double comissionPercentaje;

    public Salesperson(String name, double salary, int age, double comissionPercentaje) {
        super(name, salary, age);
        this.comissionPercentaje = comissionPercentaje;
    }

    public double getComissionPercentaje() {
        return comissionPercentaje;
    }

    public void raiseComission() {
        if (this.comissionPercentaje < .30) {
            this.comissionPercentaje *= 1.2;
        }
    }

}
