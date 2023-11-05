package lesson9.additional.task4;

public class Helper {
    static StringBuilder double_letters(String word){
        StringBuilder newWord = new StringBuilder();
        for (char c : word.toCharArray()){
            newWord.append(c).append(c);
        }
        return newWord;
    }

    static boolean validateLine(String line) {
        if (line.length() == 0 || line == null) {
            System.out.println("Вы ничего не ввели. ");
            return false;
        }
        return true;
    }

    static void printModifiedLine(String line){
        if (!validateLine(line)) {
            return;
        }

        String[] words = line.split("[.!?:\\s,]+");
        StringBuilder newLine = new StringBuilder();

        for (String word : words){
            newLine.append(double_letters(word)).append(" ");
        }

        System.out.println(newLine);
    }
}
