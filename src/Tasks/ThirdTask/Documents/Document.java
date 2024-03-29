package Tasks.ThirdTask.Documents;

import java.util.Date;

public abstract class Document {
    String docNumber;
    Date date;

    public Document(){
        docNumber = "N/A";
        date = null;
    }

    public Document(String docNumber, Date date) {
        this.docNumber = docNumber;
        this.date = date;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public Date getDate() {
        return date;
    }
}
