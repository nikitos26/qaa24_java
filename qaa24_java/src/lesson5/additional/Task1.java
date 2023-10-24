package lesson5.additional;


// Создать класс для описания компьютера, в этом классе должны быть поля: стоимость, модель(строковый тип), RAM и HDD.
// Для полей RAM и HDD следует создать свои собственные классы. Классы для RAM и HDD должны иметь конструктор по умолчанию и
// конструктор со всеми параметрами. Класс RAM имеет поля "название" и "объем". Класс HDD имеет поля "название", "объем" и "тип" (внешний или внутренний).
// Класс Computer должен иметь два конструктора:
//     - первый - с параметрами стоимость и модель,
//     - второй - со всеми полями.
// При создании объекта "компьютер" с помощью первого конструктора должны создаваться поля RAM и HDD с помощью конструкторов по умолчанию.
// В каждом из классов предусмотреть методы для вывода полной информации (вывод всех полей и всех значений).
// Тестовый сценарий для проверки:
//    - создать объект "компьютер 1" с помощью первого конструктора и
//    - вывести информацию на экран;
//    - создать объект "компьютер 2" с помощью второго конструктора и
//    - вывести информацию на экран.


public class Task1 {
    public static void main(String[] arg) {
        Computer computer1 = new Computer(2000, "Pentium 4");
        computer1.displayInfo();

        System.out.println();

        Computer computer2 = new Computer(5000, "Macintosh", new Ram("DDR2", 16), new Hdd("Samssung", "Внешний", 256));
        computer2.displayInfo();
    }
}

class Computer {
    private float cost;
    private String model;
    private Ram ram;
    private Hdd hdd;

    public Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
        ram = new Ram();
        hdd = new Hdd();
    }

    public Computer(int cost, String model, Ram ram, Hdd hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    void displayInfo() {
        System.out.println("Стоимость компьютера -> " + cost + ". Модель -> " + model + ".");
        ram.displayInfo();
        hdd.displayInfo();
    }
}

class Ram {
    String name;
    int size;

    public Ram() {
        this.name = "Unknown";
        this.size = 0;
    }

    public Ram(String name, int size) {
        this.name = name;
        this.size = size;
    }

    void displayInfo() {
        System.out.println("Имя RAM -> " + name + ". Объём RAM -> " + size + " GB.");
    }
}

class Hdd {
    private String name;
    private String type;
    private long size;

    public Hdd() {
        this.name = "Unknown";
        this.type = "внутренний";
        this.size = 0;
    }

    public Hdd(String name, String type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    void displayInfo() {
        System.out.println("Имя HDD -> " + name + ". Тип -> " + type + ". Объём HDD -> " + size + " GB.");
    }
}
