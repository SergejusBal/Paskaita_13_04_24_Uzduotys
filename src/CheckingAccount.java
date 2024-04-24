public class CheckingAccount extends BankAccount {
    private double transactionFee;

    public CheckingAccount(double balance, double transactionFee) {
        super(balance);
        this.transactionFee = transactionFee;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}
