import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter card number: ");
        String cardNumber = scanner.nextLine();

        System.out.print("Enter expiration date (MM/YY): ");
        String expirationDate = scanner.nextLine();

        System.out.print("Enter CVV: ");
        String cvv = scanner.nextLine();


        System.out.print("Enter credit limit: ");
        double creditLimit = scanner.nextDouble();

        CreditCard card = new CreditCard(cardNumber, expirationDate, cvv, creditLimit);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();
        card.makePurchase(purchaseAmount);

        System.out.print("Enter payment amount: ");
        double paymentAmount = scanner.nextDouble();
        card.makePayment(paymentAmount);

        System.out.println("Balance: " + card.getBalance());
    }

}