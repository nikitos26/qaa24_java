package lesson7.hw_task_1;

//    Написать иерархию классов «Фигуры».
//    Фигура -> Треугольник -> Прямоугольник -> Круг.
//    Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
//    Создать массив из 5 фигур.
//    Вывести на экран сумму периметра всех фигур в массиве.


public class Task1 {
    public static void main(String[] arg) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(2, 5, 2, 5);
        figures[2] = new Circle(2);
        figures[3] = new Triangle(6, 7, 8);
        figures[4] = new Rectangle(3, 6, 6, 6);


        double amount = 0;

        for (Figure figura : figures) {
            amount = figura.perimeter();
        }

        System.out.println("Cумма периметра -> " + amount);
    }
}
