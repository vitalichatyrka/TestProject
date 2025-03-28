package lesson7;

public  class Phone {
    private String model;
    private String number;
    private String weight;

    public void receiveCall(String name) {
        System.out.println("You are receiving a call from " + name );
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("You are receiving a call from " + name + '\n'  + "The phone number is: " + callerNumber);
    }
    public String getNumber () {
        return this.number;
    }
    public void sendMessage(String... numbers) {
        System.out.println("The message will be sent to the following numbers:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }
    public void getPhoneInfo() {
        System.out.println("The phone model is :" + model + '\n'
                + "The phone number is " + number + '\n'
                + "The phone weight is " + weight);
        System.out.println("******************************************");
    }

    Phone(String model, String number, String weight) {
        this(model, number);
        this.weight = weight;
    }
    Phone(String model, String number) {
        this.model = model;
        this.number = number;
        this.weight = "Unknown";
    }
    Phone() {
        this.model = "Unknown";
        this.number = "Unknown";
        this.weight = "Unknown";
    }

}
