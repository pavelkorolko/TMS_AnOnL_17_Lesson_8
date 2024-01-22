package Tasks.ThirdTask.Documents;

import java.util.Date;

public class SupplyGoodsDoc extends Document{
    String productType;
    int amount;

    public SupplyGoodsDoc(){}
    public SupplyGoodsDoc(String docNumber, Date date, String productType, int amount){
        super(docNumber, date);
        this.productType = productType;
        this.amount = amount;
    }

    public String getProductType() {
        return productType;
    }

    public int getAmount() {
        return amount;
    }
}
