package Tasks.ThirdTask.Documents;

import java.util.Date;

public class Invoice extends Document {
    double totalSumPerMonth;
    String departmentCode;

    public Invoice() {
    }

    public Invoice(String docNumber, Date date, double totalSumPerMonth, String departmentCode) {
        super(docNumber, date);
        this.totalSumPerMonth = totalSumPerMonth;
        this.departmentCode = departmentCode;
    }

    public double getTotalSumPerMonth() {
        return totalSumPerMonth;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
}
