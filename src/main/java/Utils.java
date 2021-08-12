import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    /**
     * Метод калькулятор.
     * request  - ваш пример
     * firstValue - первое число
     * secondValue - второе число
     * operation - оперрация проводимая с числами
     */
    public static void calculator(Scanner scanner) {

        String request;
        double firstValue, secondValue;
        String operation;
        // Пример писать целиком
        System.out.println("Великий Калькулятор приветствует тебя!\n Введи выражение состоящее из 2-х дробных чисел и +,-,/,*");
        //избавимся от лишних пробелов
        request = scanner.next().trim();
        //отделим цифры
        String[] array = request.split("[+\\-\\/*]");
        //распарсим String  в double
        firstValue = Double.parseDouble(array[0]);
        secondValue = Double.parseDouble(array[1]);
        //определим операцию
        Pattern p = Pattern.compile("[+\\-\\/*]");
        Matcher m = p.matcher(request);
        if (m.find()) {
            operation = m.group(0);

            System.out.println("");
            if ("+".equals(operation)) {
                System.out.printf("%.4f", (firstValue + secondValue));
            } else if ("-".equals(operation)) {
                System.out.printf("%.4f", (firstValue - secondValue));
            } else if ("/".equals(operation)) {
                System.out.printf("%.4f", (firstValue / secondValue));
            } else if ("*".equals(operation)) {
                System.out.printf("%.4f", (firstValue * secondValue));
            }
        }
    }

    /**
     * Метод запрашивает размерность массива, затем заполняем словами поочереди. Выдает самое длинное слово и количество символов.
     * Слов наибольшей длинны может быть несколько
     */

    public static void maxWordInArray(Scanner scanner) {
        int size = 0, maxLength = 0;
        String container = "";

        System.out.println("Введи размерность массива");
        size = scanner.nextInt();
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.next();
            if (array[i].length() > maxLength) {
                maxLength = array[i].length();
                container = array[i];
            } else {
                if (array[i].length() == maxLength) {
                    container = container + ", " + array[i];
                }
            }
        }
        System.out.println("Самое длинное слово: " + container);
        System.out.println("Количесво символов: " + maxLength);
    }
}

