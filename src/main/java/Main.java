import java.util.Scanner;

/**
 * Задание №1,2,3
 *
 * 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
 *
 * 2. Поиск максимального элемента в массиве. Для начала задать массив слов.Размерность массива произвольна, задается в консоли. После чего в консоли вводятся слова в количестве равном заданной длине массива. В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 *
 * 3. Программа должна выполнять одно из заданий на выбор. Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 *
 * @author Nikita Belan
 * @see #calculator(Scanner) метод калькулятора
 * @see #maxWordInArray(Scanner) поиск максимального слова в массиве
 */
public class Main extends Utils {
    public static void main(String[] args) {

        int changer = 0;
        //Создаем новый сканер
        Scanner scanner = new Scanner(System.in);
        //Выбираем программу
        System.out.println("Выбери программу:\n   1 - Калькулятор\n   2 - Поиск максимального элемента в массиве");
        changer = scanner.nextInt();

        switch (changer) {
            case 1:
                calculator(scanner);
                break;

            case 2:
                maxWordInArray(scanner);
                break;
            default:
                // Уточка
                System.out.println("Зря, зря говорит уточка\n" +
                        "___________$$$$$$\n" +
                        "___________$$_____$$\n" +
                        "__________$__(•)____$$\n" +
                        "________$$__________$\n" +
                        "___________$$_____$\n" +
                        "___________$____$\n" +
                        "_________$____$__$$$__$$______$\n" +
                        "_______$$_____$_____$$__$$__$$$\n" +
                        "_______$______$___________$$__$\n" +
                        "_______$$_______$______$$_____$\n" +
                        "_______$$________$$$$$$______$\n" +
                        "________$$$________________$\n" +
                        "__________$$$$__________$$\n" +
                        "____________$$$$$$$$$$$$");
        }
        //Закрываем сканнер
        scanner.close();
    }

}
