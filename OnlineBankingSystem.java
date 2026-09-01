abstract class Account {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name   : " + holderName);
        System.out.println("Balance       : $" + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }


    public void displayDetails() {
        System.out.println("--- Savings Account Details ---");
        super.displayDetails();
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }


    public void displayDetails() {
        System.out.println("--- Current Account Details ---");
        super.displayDetails();
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}

interface Payment {
    void pay(double amount);
}

interface SecurePayment extends Payment {
    boolean verifyPayment();
}

interface OnlineTransaction {
}

class CardPayment implements Payment, OnlineTransaction {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class UPIPayment implements SecurePayment, OnlineTransaction {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public boolean verifyPayment() {
        System.out.println("Verifying UPI PIN for ID: " + upiId + "... Verification Successful!");
        return true;
    }

    public void pay(double amount) {
        if (verifyPayment()) {
            System.out.println("Paid $" + amount + " via UPI ID: " + upiId);
        } else {
            System.out.println("UPI Payment failed authentication.");
        }
    }
}


public class OnlineBankingSystem {
    public static void main(String[] args) {
        System.out.println("=== DEMONSTRATING RUNTIME POLYMORPHISM ===");
        
      
        Account acc1 = new SavingsAccount("SA-1001", "Alice Smith", 5000.0, 4.5);
        Account acc2 = new CurrentAccount("CA-2002", "Bob Jones", 12000.0, 2000.0);

       
        acc1.displayDetails();
        System.out.println();

       
        acc2.displayDetails();
        System.out.println();

        System.out.println("=== DEMONSTRATING PAYMENT INTERFACES ===");

        Payment cardPay = new CardPayment("1234567890123456");
        Payment upiPay = new UPIPayment("user@okbank");

        cardPay.pay(150.00);
        System.out.println();
        upiPay.pay(75.50);
        System.out.println();

        System.out.println("=== CHECKING TAGGING INTERFACE (OnlineTransaction) ===");
        checkTransactionType(cardPay);
        checkTransactionType(upiPay);
    }
    private static void checkTransactionType(Payment payment) {
        if (payment instanceof OnlineTransaction) {
            System.out.println(payment.getClass().getSimpleName() + " is tagged as an Online Transaction.");
        } else {
            System.out.println(payment.getClass().getSimpleName() + " is NOT an Online Transaction.");
        }
    }
}
