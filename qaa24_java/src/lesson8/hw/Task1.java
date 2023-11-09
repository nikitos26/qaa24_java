package lesson8.hw;

//      Создать класс, в котором будет статический метод.
//      (почитать и понять, чем статический метод отличается от нестатического
//      - обсудить на занятии по необходимости)
//      Этот метод принимает на вход три параметра:
//         - Login,
//         - Password,
//         - confirmPassword.
//       Все поля имеют тип данных String.
//       Длина login должна быть меньше 20 символов и не должен содержать пробелы.
//       Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//       Длина password должна быть меньше 20 символов, не должен
//       содержать пробелом и должен содержать хотя бы одну цифру.
//       Также password и confirmPassword должны быть равны.
//       Если password не соответствует этим требованиям, необходимо
//       выбросить WrongPasswordException.
//       WrongPasswordException и WrongLoginException - пользовательские
//       классы исключения с двумя конструкторами – один по умолчанию,
//       второй принимает сообщение исключения и передает его в конструктор класса Exception.
//       Метод возвращает true, если значения верны или false в другом случае.

import java.util.Scanner;

public class Task1 {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя -> ");
        String login = scanner.nextLine();

        System.out.println("Введите пароль -> ");
        String password = scanner.nextLine();

        System.out.println("Подтвердите пароль -> ");
        String confirmPassword = scanner.nextLine();

        System.out.println();

        boolean isValidate = ValidateUser.validate(login, password, confirmPassword);
        String result = isValidate ? "Пользователь авторизирован." : "Ошибка при авторизации!";

        System.out.println(result);

    }
}
