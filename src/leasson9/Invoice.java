package leasson9;

public class Invoice extends Document{
    private int totalAmountForMonth;
    private String codeOfDepartment;

    public Invoice(String numberOfDocument, String dateOfDocument, int totalAmountForMonth, String codeOfDepartment) {
        super(numberOfDocument, dateOfDocument);
        this.totalAmountForMonth = totalAmountForMonth;
        this.codeOfDepartment = codeOfDepartment;
    }
    void getInfoAboutDocument () {
        System.out.println("This is Invoice document");
    }
}
