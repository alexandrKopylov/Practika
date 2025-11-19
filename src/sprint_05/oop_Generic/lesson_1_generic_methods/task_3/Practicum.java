package sprint_05.oop_Generic.lesson_1_generic_methods.task_3;

import java.util.*;

class MyUtils {
    public static <T> void printAll(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    public static <T> T getFirstElement(ArrayList<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    // Реализуйте здесь метод countMatches
    public static <T> int countMatches(ArrayList<T> list, T sample) {
        int count = 0;
        for (T element : list) {
            if (element.equals(sample)) {
                count++ ;
            }
        }
        return count;
    }
}
public class Practicum {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("груша");
        fruits.add("яблоко");
        fruits.add("слива");

        int count = MyUtils.countMatches(fruits, "яблоко");

        System.out.println("Количество яблок: " + count);
    }
}
