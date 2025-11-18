package sprint_05.oop_Generic.lesson_1.task_1;

import java.util.*;

class MyUtils {
    // Реализуйте здесь параметризованный метод printAll
    public static <T> void printAll(ArrayList<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}

public class Practicum {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        MyUtils.printAll(words);
        MyUtils.printAll(numbers);
    }
}
