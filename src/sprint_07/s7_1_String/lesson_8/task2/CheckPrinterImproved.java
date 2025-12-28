package sprint_07.s7_1_String.lesson_8.task2;

import java.util.ArrayList;
import java.util.List;

public class CheckPrinterImproved {

    private static int findMaxLength(String[] elements) {
        int max = 0;
        for (String e : elements) {
            if (e.length() > max) {
                max = e.length();
            }
        }
        return max;
    }

    public static void printCheck(String[] items) {
        List<String> names = new ArrayList<>();
        List<String> count = new ArrayList<>();

        for (String item : items) {
            String[] strings = item.split(", ");
            names.add(strings[0]);
            count.add(strings[1]);
        }
        String[] namesMas =  names.toArray(new String[0]);
        String[] countMas =  count.toArray(new String[0]);

        for (String item : items) {
            String[] strings = item.split(", ");
            System.out.printf("%-" + findMaxLength(namesMas) + "s  %-" + findMaxLength(countMas) + "s  %s", strings[0], strings[1], strings[2]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] values = {"Пицца, 1 шт., 310.50", "Чай, 2 шт., 113.30", "Печенье, 1 уп., 75.75"};
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество записей:");
//        int n = Integer.parseInt(scanner.nextLine());
//        String[] values = new String[n];
//        for (int i=0; i<n; ++i)
//            values[i] = scanner.nextLine();
        printCheck(values);
    }
}