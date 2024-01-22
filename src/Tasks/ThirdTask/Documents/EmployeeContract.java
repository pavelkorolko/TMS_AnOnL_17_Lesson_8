package Tasks.ThirdTask.Documents;

import java.util.Date;

public class EmployeeContract extends Document{
    Date endingDate;
    Date date;
    String employeeName;

    public EmployeeContract(){}

    public EmployeeContract(String docNumber, Date endingDate, String employeeName, Date date){
        super(docNumber, date);
        this.employeeName = employeeName;
        this.endingDate = endingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    @Override
    public Date getDate() {
        return date;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
