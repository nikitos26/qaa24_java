package lesson9.additional.task2;

public class Helper {

    static boolean validateLine(String line) {
        if (line.length() == 0 || line == null) {
            System.out.println("Вы ничего не ввели. ");
            return false;
        }
        return true;
    }

    static void uniqueWord(String line) {
        if (!validateLine(line)) {
            return;
        }

        String[] words = line.split("[.!?:\\s,]+");
        String uniqueWord = null;
        int countUniqueSymbols = 29;

        for (String word : words) {

            StringBuilder stringBuilder = new StringBuilder();

            for (int c = 0; c < word.length(); c++) {
                String letterInWord = String.valueOf(word.charAt(c));
                int charIndex = stringBuilder.indexOf(letterInWord);
                boolean isCharContains = charIndex != -1;
                if (!isCharContains) {
                    stringBuilder.append(letterInWord);
                }
            }
            if (stringBuilder.length() < countUniqueSymbols) {
                uniqueWord = word;
                countUniqueSymbols = stringBuilder.length();
            }
        }
        System.out.println(uniqueWord);
    }
}