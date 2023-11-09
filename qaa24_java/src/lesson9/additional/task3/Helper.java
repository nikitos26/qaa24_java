package lesson9.additional.task3;

public class Helper {

    static boolean validateLine(String line) {
        if (line.length() == 0 || line == null) {
            System.out.println("Вы ничего не ввели. ");
            return false;
        }
        return true;
    }

    static void checkPalindrome(String line, int userNumber) {
        if (!validateLine(line)) {
            return;
        }

        String[] words = line.split("[.!?:\\s,]+");

        String userWord = words[userNumber - 1];
        StringBuilder reversedWord = new StringBuilder(userWord).reverse();

        String result = userWord.equals(reversedWord.toString()) ? "Слово " + userWord + " полиндром." : "Слово " + userWord + " не полиндром.";
        System.out.println(result);

    }
}
