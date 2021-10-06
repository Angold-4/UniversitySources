public class TempStaff extends Staff {
    private double dailySalary;
    private int numberOfDays;

    public TempStaff(String i, String n, double ds, int nod) {
        super(i, n);
        this.dailySalary = ds;
        this.numberOfDays = nod;
    }

    public double findSalary() {
        return dailySalary*numberOfDays;
    }

    public String toString() {
        return super.toString() + ", TempStaff, $" + Double.toString(findSalary());
    }
	
}
