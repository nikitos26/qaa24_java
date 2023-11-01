package lesson8.hw;

public class ValidateUser {
    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20 || login.contains(" ")) {
                throw new WrongLoginException("Логин содержит пробелы или более 20 символов!");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают!");
            }
            if (!password.matches(".*\\d+.*")
                    || password.length() > 20
                    || password.contains(" ")) {
                throw new WrongPasswordException("Пароль содержит пробел, более 20 символов или не содержит цифр!");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
