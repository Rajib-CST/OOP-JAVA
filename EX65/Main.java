import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cardNumber = scanner.nextLine();
        String email = scanner.nextLine();
        double amount = scanner.nextDouble();
        
        PaymentProcessor processor = new PaymentProcessor();
        
        CreditCard creditCard = new CreditCard(cardNumber);
        
        PayPal payPal = new PayPal(email);
        
        System.out.println(processor.processPayment(creditCard, amount));
        
        System.out.println(processor.processPayment(payPal, amount));
    }
}
