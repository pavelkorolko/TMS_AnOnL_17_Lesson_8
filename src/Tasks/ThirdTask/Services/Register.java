package Tasks.ThirdTask.Services;

import Tasks.ThirdTask.Documents.Document;
import Tasks.ThirdTask.Documents.EmployeeContract;
import Tasks.ThirdTask.Documents.Invoice;
import Tasks.ThirdTask.Documents.SupplyGoodsDoc;
import Tasks.ThirdTask.Interfaces.IRegister;

public class Register implements IRegister {
    Document[] documents;

    public Register() {
        this.documents = new Document[10];
    }

    @Override
    public void saveDocument(Document document) throws Exception {
        for (int i = 0; i < documents.length; i++) {
            if (documents[documents.length - 1] != null) {
                throw new Exception("Not enough space!");
            }
            if (documents[i] == null) {
                documents[i] = document;
                break;
            }
        }
    }

    @Override
    public String getInfo(Document document) {
        if (document instanceof Invoice) {
            Invoice temp = (Invoice) document;
            return "Total sum per month: " + temp.getTotalSumPerMonth() + ", department: " + temp.getDepartmentCode() + ", document number: " + temp.getDocNumber() + ", date: " + temp.getDate();
        }

        if (document instanceof EmployeeContract) {
            EmployeeContract temp = (EmployeeContract) document;
            return "Employee name: " + temp.getEmployeeName() + ", ending date: " + temp.getEndingDate() + ", document number: " + temp.getDocNumber() + ", date: " + temp.getDate();
        }

        if (document instanceof SupplyGoodsDoc) {
            SupplyGoodsDoc temp = (SupplyGoodsDoc) document;
            return "Product type: " + temp.getProductType() + ", amount: " + temp.getAmount() + ", document number: " + temp.getDocNumber() + ", date: " + temp.getDate();
        }

        return null;
    }
}
