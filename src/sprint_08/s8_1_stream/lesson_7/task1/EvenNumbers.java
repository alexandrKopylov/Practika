package sprint_08.s8_1_stream.lesson_7.task1;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args) {
        List<Integer> inputNumbers = List.of(2, 5, 4, 2, 3, 8);
        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer number: inputNumbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        System.out.println(evenNumbers);
    }
}