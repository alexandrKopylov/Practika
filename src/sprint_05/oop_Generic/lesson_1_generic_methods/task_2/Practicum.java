package sprint_05.oop_Generic.lesson_1_generic_methods.task_2;

import java.util.*;

class MyUtils {
    public static <T> void printAll(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }

    // Реализуйте метод getFirstElement
    public static <T> T getFirstElement(List<T> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }
}

public class Practicum {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("alpha");
        words.add("beta");
        words.add("gamma");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        String firstWord = MyUtils.getFirstElement(words);
        Integer firstNumber = MyUtils.getFirstElement(numbers);

        System.out.println("Первое слово: " + firstWord);

    }
}
