public class Account {
    private double availableAmount;

    public double getAvailableAmount() {
        return this.availableAmount;
    }

    public void setAvailableAmount(double word) {
        availableAmount = word;
    }

    public Account(double AvailableAmount) {
        availableAmount = AvailableAmount;
    }

    public Account() {
    }


    public double averageAmount(Account[] accountArray) {
        double totalAmount = 0;
        for (Account a : accountArray) {
            totalAmount += a.getAvailableAmount();
        }
        return totalAmount / accountArray.length;
    }
}

class SavingAccount extends Account {
    private double interest;
    public void setInterest(double word) {
        interest = word;
    }

    public double getInterest() {
        return interest;
    }

    public SavingAccount(double AvailableAmount, double Interest) {
        super(AvailableAmount);
        interest = Interest;
    }

    @Override
    public double getAvailableAmount() {
        return interest + getAvailableAmount();
    }

}

class FrozenAccount extends Account {
    @Override
    public double getAvailableAmount() {
        return 0;
    }
}
