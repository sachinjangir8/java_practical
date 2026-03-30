
interface Payment {  
    void makePayment(double amount);
    void showPaymentDetails();
}

// -----------------------------------------

class CreditCardPayment implements Payment {
    String cardHolder;

    CreditCardPayment(String name) {
        cardHolder = name;
    }

    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " done using Credit Card.");
    }

    public void showPaymentDetails() {
        System.out.println("Card Holder Name: " + cardHolder);
        System.out.println("Payment Method: Credit Card");
    }
}

// ---------------------------------------------------
class DebitCardPayment implements Payment {
    String cardHolder;

    DebitCardPayment(String name) {
        cardHolder = name;
    }

    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " done using Debit Card.");
    }

    public void showPaymentDetails() {
        System.out.println("Card Holder Name: " + cardHolder);
        System.out.println("Payment Method: Debit Card");
    }
}

// ---------------------------------------------------

class UPIPayment implements Payment {
    String upiId;

    UPIPayment(String id) {
        upiId = id;
    }

    public void makePayment(double amount) {
        System.out.println("Payment of Rs." + amount + " done using UPI.");
    }

    public void showPaymentDetails() {
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payment Method: UPI");
    }
}

// ----------------------------------------------------

public class payment_06 {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment("Rahul Sharma");
        Payment p2 = new DebitCardPayment("Amit Kumar");
        Payment p3 = new UPIPayment("rahul@upi");

        System.out.println("----Credit Card Payment----");
        p1.showPaymentDetails();
        p1.makePayment(55000);

        System.out.println("\n----Debit Card Payment----");
        p2.showPaymentDetails();
        p2.makePayment(15000);

        System.out.println("\n----UPI Payment----");
        p3.showPaymentDetails();
        p3.makePayment(5000);
    }
}

