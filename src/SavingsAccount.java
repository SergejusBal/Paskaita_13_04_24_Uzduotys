public class SavingsAccount extends BankAccount {

    private double interstRate;
    public SavingsAccount(double balance, double interstRate) {
        super(balance);
        this.interstRate = interstRate;
    }

    public double getInterstRate() {
        return interstRate;
    }

    public void setInterstRate(double interstRate) {
        this.interstRate = interstRate;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * (this.interstRate);
    }
}
