package lesson5.hw;

//        Создать класс CreditCard c полями номер счета, текущая сумма на счету.
//        Добавьте метод, который позволяет начислять сумму на кредитную карточку.
//        Добавьте метод, который позволяет снимать с карточки некоторую сумму.
//        Добавьте метод, который выводит текущую информацию о карточке.
//        Напишите программу, которая создает три объекта класса CreditCard у
//        которых заданы номер счета и начальная сумма
//        Тестовый сценарий для проверки:
//        Положите деньги на первые две карточки и снимите с третьей.
//        Выведите на экран текущее состояние всех трех карточек.

public class Task1 {
    public static void main(String[]arg){
        CreditCard momsCard = new CreditCard("123", 500);
        CreditCard dadsCard = new CreditCard("456", 800);
        CreditCard daughtersCard = new CreditCard("789", 100);

        momsCard.displayInfo();
        dadsCard.displayInfo();
        daughtersCard.displayInfo();

        System.out.println();

        momsCard.refill(300);
        dadsCard.refill(300);
        daughtersCard.withdraw(50);

        System.out.println();

        momsCard.displayInfo();
        dadsCard.displayInfo();
        daughtersCard.displayInfo();
    }
}

class CreditCard {
    float balance;
    String cardNumber;

    public CreditCard(String cardNumber, int balance){
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Номер карты -> " + cardNumber);
        System.out.println("Остаток на карте -> " + balance);
    }

    void refill(int value) {
        balance += value;
    }

    void withdraw(int value){
        balance -= value;
    }
}
