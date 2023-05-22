public class Account {
    private String Name;
    private double balance;

    public void setName(String name) {
        Name = name;
    }
    public void setAccountNumber(double accountNumber){
        return accountNumber;
    }

    public String getName() {
        return Name;
    }
    public void deposit(double funds){
        if(funds > 0)this.balance += funds;
    }

    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) {
        if(amount > this.balance) {
            System.out.println("insufficient funds");
        } else if (amount > 0 && amount < balance)
            balance -= amount;
        else {
            System.out.println("transaction invalid");
        }

    }

}

