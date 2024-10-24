public class CreditCard {
    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private double balance;
    private double creditLimit;

    public CreditCard(String cardNumber, String expirationDate, String cvv, double creditLimit) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.creditLimit = creditLimit;
        this.balance = 0.0;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public boolean makePurchase(double amount) {
        if (balance + amount <= creditLimit) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }
    public boolean makePayment(double amount) {
        if (amount > 0) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
