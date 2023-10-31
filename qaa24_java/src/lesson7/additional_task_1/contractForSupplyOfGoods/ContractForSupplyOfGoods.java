package lesson7.additional_task_1.contractForSupplyOfGoods;

import lesson7.additional_task_1.document.Document;

import java.util.Date;

public class ContractForSupplyOfGoods extends Document {
    private String goodsType;
    private String goodsAmount;

    public ContractForSupplyOfGoods() {
    }

    public ContractForSupplyOfGoods(String typeGoods, String amountGoods, String docNumber, Date date) {
        super(date, docNumber);
        this.goodsType = typeGoods;
        this.goodsAmount = amountGoods;

    }

    @Override
    public void printInfo() {
        System.out.println("Контракт на поставку товаров");
        System.out.println("Номер документа: " + docNumber);
        System.out.println("Тип товарa: " + goodsType);
        System.out.println("Количество товарa: " + goodsAmount);
        System.out.println("Дата документа: " + date);
        System.out.println();
    }
}
