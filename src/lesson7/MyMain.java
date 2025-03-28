package lesson7;

public class MyMain {
    public static void main(String[] args) {
Phone firstPhone = new Phone("Samsung", "+375291456788", "123g");
Phone secondPhone = new Phone("iPhone", "+375334455799");
Phone thirdPhone = new Phone();

        firstPhone.getPhoneInfo();
        secondPhone.getPhoneInfo();
        thirdPhone.getPhoneInfo();

        System.out.println("The phone number is : " + firstPhone.getNumber());
        secondPhone.receiveCall("Alex");
        thirdPhone.receiveCall("Nina", "+375339087654");
        firstPhone.sendMessage("+375339087654", "+375299087699", "+3753390876oo");


    }
}
