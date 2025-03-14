package OOPs; //Abstraction

public class Abstraction 
{
	public static void main(String[] args) 
	{
     // Polymorphism: Abstract class reference, subclass objects
     Payment payment1 = new CreditCardPayment();
     Payment payment2 = new PayPalPayment();
     Payment payment3 = new BankTransferPayment();

     // Call methods
     payment1.processPayment(150.0); // Credit card payment
     payment2.processPayment(250.0); // PayPal payment
     payment3.processPayment(500.0); // Bank transfer payment
	}
}

//Abstract class
abstract class Payment {
 // Abstract method (must be implemented by subclasses)
 abstract void processPayment(double amount);

 // Concrete method (shared by all payments)
 void showPaymentDetails(double amount) {
     System.out.println("Processing payment of amount: $" + amount);
 }
}

//Subclass 1: CreditCardPayment
class CreditCardPayment extends Payment {
 @Override
 void processPayment(double amount) 
 	{
     showPaymentDetails(amount);
     System.out.println("Payment made using Credit Card.");
 	}
}

//Subclass 2: PayPalPayment
class PayPalPayment extends Payment 
{
 @Override
 void processPayment(double amount) {
     showPaymentDetails(amount);
     System.out.println("Payment made using PayPal.");
 }
}

//Subclass 3: BankTransferPayment
class BankTransferPayment extends Payment {
 @Override
 void processPayment(double amount) {
     showPaymentDetails(amount);
     System.out.println("Payment made using Bank Transfer.");
 }
}


/*
Abstract Class:

The Payment class is abstract and contains:
Abstract Method: processPayment() to enforce the implementation of payment processing in all payment types.
Concrete Method: showPaymentDetails() for displaying the payment amount, which is common for all payment types.

Subclasses:
CreditCardPayment, PayPalPayment, and BankTransferPayment extend the Payment class.
Each subclass provides its own implementation of processPayment().

Polymorphism:
The Payment reference (payment1, payment2, payment3) is used to refer to objects of its subclasses, demonstrating runtime polymorphism.
Real-World Scenario:

Abstract class ensures that all payment types follow the same process structure while allowing for customization of the implementation.


*/