public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit successful." + "New balance: " + this.balance );
    }

    public void Overloaded_deposit(double amount, String transactionNote){
        this.balance += amount;
        System.out.println("Overloaded deposit successful." + "New balance: " + this.balance );
    }

    public void Withdraw(double amount){
        this.balance -= amount;
        if(this.balance >= amount){
            System.out.println("Withdraw successful." + "New balance: " + this.balance );
        }
        else{
            System.out.println("Insufficient funds" );
        }
    }













}

