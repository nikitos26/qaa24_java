package lesson7.additional_task_1.document;

import java.util.Date;

public abstract class Document {
    protected Date date;
    protected String docNumber;

    public Document(Date date, String docNumber) {
        this.date = date;
        this.docNumber = docNumber;
    }

    public Document() {
    }

    public abstract void printInfo();

}
