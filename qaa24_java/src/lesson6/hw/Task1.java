package lesson6.hw;

//  Класс Phone.
//  Создайте класс Phone, который содержит переменные number, model и weight.
//  Создайте три экземпляра этого класса.
//  Выведите на консоль значения их переменных.
//  Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
//  звонящего. Выводит на консоль сообщение “Звонит {name}”. getNumber –
//  возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//  Добавить конструктор в класс Phone, который принимает на вход три
//  параметра для инициализации переменных класса - number, model и weight.
//  Добавить конструктор, который принимает на вход два параметра для
//  инициализации переменных класса - number, model.
//  Добавить конструктор без параметров.
//  Вызвать из конструктора с тремя параметрами конструктор с двумя.
//  Добавьте перегруженный метод receiveCall, который принимает два
//  параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
//  Создать метод sendMessage с аргументами переменной длины. Данный
//  метод принимает на вход номера телефонов, которым будет отправлено
//  сообщение. Метод выводит на консоль номера этих телефонов.

public class Task1 {
    public static void main(String[] arg) {
        Phone phone1 = new Phone("123456789", "Nokia", 150.0);
        Phone phone2 = new Phone("987654321", "Samsung");
        Phone phone3 = new Phone();

        phone1.printInfo();
        phone1.receiveCall("Volha");
        System.out.println("Номер телефона -> " + phone1.getNumber());

        System.out.println();
        phone2.receiveCall("Mikita");
        System.out.println("Номер телефона: " + phone2.getNumber());

        System.out.println();
        phone3.printInfo();
        phone3.receiveCall("Varvara");
        System.out.println("Номер телефона: " + phone3.getNumber());

        System.out.println();
        phone1.sendMessage("111", "222", "333");
        phone2.sendMessage("444", "555");
    }
}

class Phone {
    private String number;
    private String model;
    private double weight;

    public void printInfo() {
        System.out.println("Номер: " + number);
        System.out.println("Модель: " + model);
        System.out.println("Вес: " + weight + " г");
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит -> " + name + ", c номера -> " + number);
    }

    public void sendMessage(String... number) {
        System.out.print("Отправить сообщение на номера: ");
        for (String num : number) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
