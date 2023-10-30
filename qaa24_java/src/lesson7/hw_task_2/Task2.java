package lesson7.hw_task_2;

//        Создать классы "Директор", "Рабочий", "Бухгалтер".
//        Реализовать интерфейс с методом, который печатает название должности и
//        имплементировать этот метод в созданные классы.

public class Task2 {
    public static void main(String[]arg){
        Director director = new Director();
        Employee employee = new Employee();
        Accountant accountant = new Accountant();

        director.job_title();
        employee.job_title();
        accountant.job_title();
    }
}
