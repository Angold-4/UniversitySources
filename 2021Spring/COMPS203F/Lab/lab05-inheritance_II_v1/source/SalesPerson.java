public class SalesPerson extends Staff {
    private double basicSalary;
    private double salesAmount;
    private static double commissionRate = 0.01;

    public SalesPerson(String i, String n, double bs, double sa) {
        super(i, n);
        this.basicSalary = bs;
        this.salesAmount = sa;
    }

    public double findSalary() {
        return basicSalary + salesAmount*commissionRate;
        
    }

    public String toString() {
        return super.toString() + ", SalesPerson, $" + Double.toString(findSalary());
    }
}
