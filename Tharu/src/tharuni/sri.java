 package tharuni;
import java.util.UUID;

// ────────── Abstract Class ──────────
abstract class Payment {
    public abstract void initiatePayment();
    public abstract void verifyPayment();

    public String generateTransactionId() {
        return UUID.randomUUID().toString();
    }
}

// ────────── Subclasses ──────────
class CreditCardPayment extends Payment {
    @Override
    public void initiatePayment() {
        System.out.println("Initiating credit card payment...");
    }

    @Override
    public void verifyPayment() {
        System.out.println("Verifying credit card payment...");
    }
}

class UPIPayment extends Payment {
    @Override
    public void initiatePayment() {
        System.out.println("Initiating UPI payment...");
    }

    @Override
    public void verifyPayment() {
        System.out.println("Verifying UPI payment...");
    }
}

class NetBankingPayment extends Payment {
    @Override
    public void initiatePayment() {
        System.out.println("Initiating net banking payment...");
    }

    @Override
    public void verifyPayment() {
        System.out.println("Verifying net banking payment...");
    }
}

// ────────── Main and Dynamic Dispatch ──────────
public class sri {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment(),
            new UPIPayment(),
            new NetBankingPayment()
        };

        for (Payment payment : payments) {
            String txId = payment.generateTransactionId();
            System.out.println("Transaction ID: " + txId);
            payment.initiatePayment();
            payment.verifyPayment();
            System.out.println("------------------------------");
        }
    }
}
