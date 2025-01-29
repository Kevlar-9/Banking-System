class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountHolderName, String accountNumber, double balance, double interestRate) {
        super(accountHolderName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void withdraw(double amount) {
        if (super.balance - amount >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Minimum balance requirement not met.");
        }
    }

    public void calculateInterest() {
        double interest = super.balance * (interestRate / 100);
        System.out.println("Annual Interest: " + interest);
    }

    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}