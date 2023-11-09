package lesson9.hw.task1;

public class docHelper {
    static void validateDocNumberFormat(String docNumber) {
        String result = docNumber.matches("^\\d{4}-[A-zА-я]{3}-\\d{4}-[A-zА-я]{3}-\\d[A-zА-я]\\d[A-zА-я]$") ?
                "Номер документа имеет верный формат" : "Формат документа не правильный! ";
        System.out.println(result);
    }

    static void printNumbersFromBlocks(String docNumber) {
        String numbersFromBlocks = String.join("-", docNumber.substring(0, 4), docNumber.substring(9, 13));
        System.out.println(numbersFromBlocks);
    }

    static void replaceChars(String docNumber) {
        String modifiedDocNumber = docNumber.replaceAll("[a-zA-Z]{3}", "***");
        System.out.println(modifiedDocNumber);
    }

    static void printLettersInFormatLowerCase(String docNumber) {
        String lettersInFormat = String.join("/", docNumber.substring(5, 8), docNumber.substring(14, 17),
                String.valueOf(docNumber.charAt(19)), String.valueOf(docNumber.charAt(21)));
        System.out.println(lettersInFormat.toLowerCase());
    }

    static void printLettersInFormatUpperCase(String docNumber) {
        StringBuilder result = new StringBuilder("Letters:");

        result.append(docNumber.substring(5, 8).toUpperCase()).append("/")
                .append(docNumber.substring(14, 17).toUpperCase()).append("/")
                .append(String.valueOf(docNumber.charAt(19)).toUpperCase()).append("/")
                .append(String.valueOf(docNumber.charAt(21)).toUpperCase());
        System.out.println(result);
    }

    static void valueContains(String docNumber, String value) {
        String result = docNumber.toLowerCase().contains(value.toLowerCase()) ? "Значение содержится в номере документа"
                : "Значение не содержится в номере документа";
        System.out.println(result);
    }

    static void checkStart(String docNumber) {
        String result = docNumber.startsWith("555") ? "Документ начинается на 555." : "Документ не начинается на 555.";
        System.out.println(result);
    }

    static void checkEnd(String docNumber) {
        String result = docNumber.endsWith("1a2b") ? "Документ заканчивается на 1a2b." : "Документ не заканчивается на 1a2b.";
        System.out.println(result);
    }
}
