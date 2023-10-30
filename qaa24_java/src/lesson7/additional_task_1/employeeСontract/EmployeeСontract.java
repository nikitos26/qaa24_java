package lesson7.additional_task_1.employeeСontract;

import lesson7.additional_task_1.document.Document;

import java.util.Date;

public class EmployeeСontract extends Document {
    private String docEndDate;
    private String employeeName;

    public EmployeeСontract() {
    }

    public EmployeeСontract(String docNumber, Date date, String docEndDate, String employeeName) {
        super(date, docNumber);
        this.docEndDate = docEndDate;
        this.employeeName = employeeName;
    }

    @Override
    public void printInfo() {
        System.out.println("Контракт с сотрудником");
        System.out.println("Номер документа: " + docNumber);
        System.out.println("Дата документа: " + date);
        System.out.println("Дата заверешния контракта: " + docEndDate);
        System.out.println("Имя сотрудника: " + employeeName);
        System.out.println();
    }
}

