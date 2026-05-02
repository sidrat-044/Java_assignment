class Account {
    double balance;
    double rateOfInterest;

    Account(double balance, double rateOfInterest) {
        this.balance = balance;
        this.rateOfInterest = rateOfInterest;
    }

    double getBalance() {
        return balance;
    }

    void addInterest() {
        balance = balance + (balance * rateOfInterest / 100);
    }
}

class Savings extends Account {

    Savings(double balance, double rateOfInterest) {
        super(balance, rateOfInterest);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void getDetails() {
        System.out.println("Savings Balance: " + balance);
    }
}

class Credit extends Account {

    Credit(double balance, double rateOfInterest) {
        super(balance, rateOfInterest);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void getDetails() {
        System.out.println("Credit Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {

        Savings s = new Savings(1000, 5);
        s.deposit(500);
        s.withdraw(200);
        s.addInterest();
        s.getDetails();

        Credit c = new Credit(2000, 3);
        c.deposit(1000);
        c.withdraw(500);
        c.addInterest();
        c.getDetails();
    }
}