class Payment {
    public void pay(double amount) {
        System.out.println("Processing generic payment of $" + amount);
    }
}

class CreditCardPayment extends Payment {
    
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class UPIPayment extends Payment {
    
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI.");
    }
}

class NetBankingPayment extends Payment {
    
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Net Banking.");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.pay(250.75);

        Payment p2 = new UPIPayment();
        p2.pay(50.00);

        Payment p3 = new NetBankingPayment();
        p3.pay(1200.00);
    }
}
