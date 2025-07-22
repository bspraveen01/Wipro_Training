package Day3;

public class BankAccMain {
    public static void main(String[] args) {
       BankAccount b = new BankAccount("praven", 1000.0);
       b.deposit(25000.00);
       b.withdraw(13000);
       b.displayDetails();
    }
} 
