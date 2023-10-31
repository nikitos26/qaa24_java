package lesson7.additional_task_1;

//      Создать систему для учета документов.
//      Создать класс Регистр, который будет иметь методы:
//        - сохранения документа в регистре
//        - предоставление информации о документе
//      Система может работать с тремя типами документов:
//        1) Контракт на поставку товаров
//        Содержит поля:
//        - Номер документа
//        - Тип товаров
//        - Количество товаров
//        - Дата документа
//        2) Контракт с сотрудником
//        Содержит поля:
//        - Номер документа
//        - Дата документа
//        - Дата документа
//        - Дата окончания контракта
//        - Имя сотрудника
//        3) Финансовая накладная
//        Содержит поля:
//        - Итоговая сумма за месяц
//        - Дата документа
//        - Номер документа
//        - Код департамента

//      - Класс регистр должен содержать внутри себя массив и при добавлении
//      документа в регистр этот добавляемый документ должен добавляться в массив;
//      - Массив для класса регистра должен быть размером 10;
//      - Для полей "Дата документа" следует использовать тип данных Date;
//      - В методе предоставления информации о документе следует выводить на экран
//      информацию о переданном входным параметром документе;
//      - Каждый класс для описания документов должен содержать конструктор с
//      параметрами и без;
//      - Для имитации работы системы создайте класс Main, который будет содержать
//      только один метод public static void main
//      В этом методе напишите код для создания каждого из типов документов,
//      добавления их в регистр и вывода информации о документе;
//      - Все классы разместить по пакетам;
//      - При выполнении задания использовать понятия интерфейсов и абстрактных классов.


import lesson7.additional_task_1.contractForSupplyOfGoods.ContractForSupplyOfGoods;
import lesson7.additional_task_1.document.Document;
import lesson7.additional_task_1.employeeСontract.EmployeeСontract;
import lesson7.additional_task_1.financialInvoice.FinancialInvoice;
import lesson7.additional_task_1.register.Register;

import java.util.Date;

public class Task1 {
    public static void main(String[] arg) {
        Register register = new Register();

        Document document1 = new ContractForSupplyOfGoods("Молоко", "10л", "1", new Date());
        Document document2 = new EmployeeСontract("2", new Date(), "31.12.25", "Bob");
        Document document3 = new FinancialInvoice(new Date(), "3", "12", "1");
        Document document4 = new ContractForSupplyOfGoods("Кефир", "15л", "4", new Date());
        Document document5 = new EmployeeСontract("5", new Date(), "26.08.25", "Nick");
        Document document6 = new FinancialInvoice(new Date(), "6", "7", "2");
        Document document7 = new ContractForSupplyOfGoods("Koла", "3л", "8", new Date());
        Document document8 = new FinancialInvoice(new Date(), "8", "10", "3");
        Document document9 = new EmployeeСontract("9", new Date(), "12.08.23", "Max");
        Document document10 = new ContractForSupplyOfGoods("Квас", "5л", "10", new Date());

        register.saveDoc(document1);
        register.saveDoc(document2);
        register.saveDoc(document3);
        register.saveDoc(document4);
        register.saveDoc(document5);
        register.saveDoc(document6);
        register.saveDoc(document7);
        register.saveDoc(document8);
        register.saveDoc(document9);
        register.saveDoc(document10);

        register.displayDocumentsInfo();

    }
}



