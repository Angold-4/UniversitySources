public class Manager extends Staff {
    private double salary;

    public Manager(String i, String n, double s) {
        super(i, n);
        this.salary = s;
    }

    public String toString() {
        return super.toString() + ", Manager, $" + salary;
    }

    public double findSalary() {
        return salary;
    }
}
