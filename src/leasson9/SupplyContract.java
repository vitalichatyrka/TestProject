package leasson9;

public class SupplyContract extends Document{
    private String typeOfGoods;
    private String countOfGoods;

    public SupplyContract (String numberOfDocument, String dateOfDocument,String typeOfGoods, String countOfGoods) {
        super(numberOfDocument, dateOfDocument);
        this.typeOfGoods = typeOfGoods;
        this.countOfGoods = countOfGoods;
    }
}
