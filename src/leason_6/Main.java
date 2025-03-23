package leason_6;

public class Main {
    public static void main(String[] args) {
        CreditCard firstCreditCard = new CreditCard("4539 1488 0343 6467", 1000);
        CreditCard secondCreditCard = new CreditCard("5196 2415 8031 9872", 2000);
        CreditCard thirdCreditCard = new CreditCard("6011 9012 5678 3456", 3000);
        firstCreditCard.topUpBalance(200);
        secondCreditCard.topUpBalance(300);
        thirdCreditCard.reduceBalance(500);
        firstCreditCard.getCardInfo();
        secondCreditCard.getCardInfo();
        thirdCreditCard.getCardInfo();
    }
}
