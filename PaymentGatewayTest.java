import java.util.ArrayList;
import java.util.List;

abstract class PaymentProcessor{
    List<String> transactionHistory = new ArrayList<>();
    abstract void processPayment(double amount);
    abstract void refund(double amount);

    public void printTransactionHistory(){
        if(transactionHistory.isEmpty()){
            System.out.println("No transaction yet.");
        }else{
            System.out.println("Transaction History:");
            for(String txt:transactionHistory){
                System.out.println(txt);
            }
        }
    }
}

class CreditCardPayment extends PaymentProcessor{

    @Override
    void processPayment(double amount) {
        transactionHistory.add("Creadit Card Payment: $ " + amount);
        System.out.println("Processed credit card payment of $ "+ amount);
    }

    @Override
    void refund(double amount) {
        transactionHistory.add("Credit Card Refund: $ "+ amount);
        System.out.println("Refunded $ " + amount + " to credit card.");

    }
}
class PaypalPayment extends PaymentProcessor{

    @Override
    void processPayment(double amount) {
        transactionHistory.add("PayPal Payment: $ "+ amount);
        System.out.println("Processed PayPal payment of $ "+amount);
    }

    @Override
    void refund(double amount) {
        transactionHistory.add("Paypal Refund: $ " + amount);
        System.out.println("Refunded $ "+ amount +" via PayPal.");
    }
}
class UPIPayment extends PaymentProcessor {
    @Override
    void processPayment(double amount) {
        transactionHistory.add("UPI Payment: $" + amount);
        System.out.println("Processed UPI payment of $" + amount);
    }

    @Override
    void refund(double amount) {
        transactionHistory.add("UPI Refund: $" + amount);
        System.out.println("Refunded $" + amount + " via UPI.");
    }
}

public class PaymentGatewayTest {
    public static void main(String[] args) {
        PaymentProcessor payment1 = new CreditCardPayment();
        payment1.processPayment(150.0);
        payment1.refund(50.0);
        payment1.printTransactionHistory();

        System.out.println();

        PaymentProcessor payment2 = new PaypalPayment();
        payment2.processPayment(200.0);
        payment2.printTransactionHistory();
    }
}
