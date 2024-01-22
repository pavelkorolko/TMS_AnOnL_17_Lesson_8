package Tasks.ThirdTask.Interfaces;

import Tasks.ThirdTask.Documents.Document;

public interface IRegister {
    void saveDocument(Document document) throws Exception;
    String getInfo(Document document);
}
