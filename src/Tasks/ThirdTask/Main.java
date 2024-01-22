package Tasks.ThirdTask;

import Tasks.ThirdTask.Documents.EmployeeContract;
import Tasks.ThirdTask.Documents.Invoice;
import Tasks.ThirdTask.Documents.SupplyGoodsDoc;
import Tasks.ThirdTask.Services.Register;


import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();
        try {
            EmployeeContract contract1 = new EmployeeContract("C001", new Date(2018,11,4), "John Doe", new Date(2019,4,10));
            EmployeeContract contract2 = new EmployeeContract("C002", new Date(2019, 9, 3), "Jane Doe", new Date(2018,12,1));
            EmployeeContract contract3 = new EmployeeContract("C003", new Date(2022, 10, 10), "Bob Smith", new Date(2022, 10,11));

            register.saveDocument(contract1);
            register.saveDocument(contract2);
            register.saveDocument(contract3);

            Invoice invoice1 = new Invoice("INV001", new Date(2018,9,9), 1500.0, "D001");
            Invoice invoice2 = new Invoice("INV002", new Date(2018,12,10), 2000.0, "D002");
            Invoice invoice3 = new Invoice("INV003", new Date(2018,10,11), 1200.0, "D003");

            register.saveDocument(invoice1);
            register.saveDocument(invoice2);
            register.saveDocument(invoice3);


            SupplyGoodsDoc supply1 = new SupplyGoodsDoc("SGD001", new Date(2019,1,14), "Electronics", 100);
            SupplyGoodsDoc supply2 = new SupplyGoodsDoc("SGD002", new Date(2020,3,11), "Clothing", 200);
            SupplyGoodsDoc supply3 = new SupplyGoodsDoc("SGD003", new Date(2021,5,17), "Office Supplies", 50);

            register.saveDocument(supply1);
            register.saveDocument(supply2);
            register.saveDocument(supply3);

            System.out.println(register.getInfo(supply1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
