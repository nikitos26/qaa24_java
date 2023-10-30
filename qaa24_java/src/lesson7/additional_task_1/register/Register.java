package lesson7.additional_task_1.register;

import lesson7.additional_task_1.Helper;
import lesson7.additional_task_1.document.Document;

public class Register implements Helper {
    private Document[] register = new Document[10];
    int countDocs = 0;

    @Override
    public void saveDoc(Document document) {
        if (countDocs >= 10) {
            System.out.println("Регистр заполнен");
            return;
        }
        register[countDocs] = document;
        countDocs++;
    }

    @Override
    public void displayDocumentsInfo() {
        for (Document document : register) {
            if (document != null) {
                document.printInfo();
            }
        }
    }
}
