package leasson9;

public class EmploymentContract extends Document{
    private String contractEndDate;
    private String nameOfEmployee;


    public EmploymentContract(String numberOfDocument, String dateOfDocument, String contractEndDate, String nameOfEmployee) {
        super(numberOfDocument, dateOfDocument);
        this.contractEndDate = contractEndDate;
        this.nameOfEmployee = nameOfEmployee;
    }
}
