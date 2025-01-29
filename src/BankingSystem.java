public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Alice", "SA123", 500, 3);
        CurrentAccount current = new CurrentAccount("Bob", "CA456", 1000, 500);

        System.out.println("\n--- Savings Account Operations ---");
        savings.deposit(200);
        savings.deposit(150, "Salary deposit.");
        savings.withdraw(450);
        savings.calculateInterest();
        savings.displayAccountDetails();

        System.out.println("\n--- Current Account Operations ---");
        current.deposit(300);
        current.deposit(100, "Business deposit.");
        current.withdraw(1600);
        current.displayAccountDetails();
    }
}