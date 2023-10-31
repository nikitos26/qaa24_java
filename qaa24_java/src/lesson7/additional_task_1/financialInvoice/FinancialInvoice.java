package lesson7.additional_task_1.financialInvoice;

import lesson7.additional_task_1.document.Document;

import java.util.Date;

public class FinancialInvoice extends Document {
    private String totalAmountForMonth;
    private String departmentCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(Date date, String docNumber, String totalAmountForMonth, String departmentCode) {
        super(date, docNumber);
        this.totalAmountForMonth = totalAmountForMonth;
        this.departmentCode = departmentCode;
    }

    @Override
    public void printInfo() {
        System.out.println("Финансовая накладная");
        System.out.println("Итоговая сумма за месяц: " + totalAmountForMonth);
        System.out.println("Дата документа: " + date);
        System.out.println("Номер документа: " + docNumber);
        System.out.println("Код департамента: " + departmentCode);
        System.out.println();
    }

}
