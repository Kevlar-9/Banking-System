class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, String accountNumber, double balance, double overdraftLimit) {
        super(accountHolderName, accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amount) {
        if (super.balance + overdraftLimit >= amount) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}


