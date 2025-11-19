import java.util.*;

// Base class
class Account {
    String name;
    String accNumber;
    String accType;
    double balance;

    Account(String name, String accNumber, String accType) {
        this.name = name;
        this.accNumber = accNumber;
        this.accType = accType;
        this.balance = 0.0;
    }

    // Deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    // Display balance
    void displayBalance() {
        System.out.println("Current balance: ₹" + balance);
    }

    // Withdraw money (to be overridden)
    void withdraw(double amount) {
        System.out.println("Withdraw method not implemented in base class.");
    }
}

// Current Account class
class CurAcct extends Account {
    final double MIN_BALANCE = 1000;
    final double PENALTY = 100;

    CurAcct(String name, String accNumber) {
        super(name, accNumber, "Current Account");
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("❌ Insufficient balance!");
            return;
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");

        if (balance < MIN_BALANCE) {
            balance -= PENALTY;
            System.out.println("⚠ Minimum balance not maintained! Penalty of ₹" + PENALTY + " imposed.");
        }
    }
}

// Savings Account class
class SavAcct extends Account {
    final double INTEREST_RATE = 0.04; // 4% annual interest

    SavAcct(String name, String accNumber) {
        super(name, accNumber, "Savings Account");
    }

    // Compute and deposit interest
    void computeInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interest of ₹" + interest + " added to account.");
    }

    @Override
    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("❌ Insufficient balance!");
            return;
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
}

// Main class to test
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test Savings Account
        SavAcct sav = new SavAcct("Alice", "S001");
        sav.deposit(5000);
        sav.displayBalance();
        sav.computeInterest();
        sav.displayBalance();
        sav.withdraw(1500);
        sav.displayBalance();

        System.out.println("\n--- Current Account ---");
        // Test Current Account
        CurAcct cur = new CurAcct("Bob", "C001");
        cur.deposit(2000);
        cur.displayBalance();
        cur.withdraw(1500);  // should apply penalty
        cur.displayBalance();

        sc.close();
    }
}
