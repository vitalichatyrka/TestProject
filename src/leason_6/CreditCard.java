package leason_6;

public class CreditCard {
    private final String cardNumber;
    private double balance;

    public void topUpBalance(double amount){
        balance+=amount;
    }
    public void reduceBalance(double amount){
        balance-=amount;
    }
    public void getCardInfo(){
        System.out.println("Card number: " + this.cardNumber + " Balance: " + this.balance );
    }
CreditCard(String cardNumber, double balance){
        this.cardNumber = cardNumber;
        this.balance = balance;
}
}
