package sprint_06.vvedenie_v_algoritmi;

import java.util.List;

public class Practicum {

    public static void main(String[] args) {

        final String[] coffeeArray = {"Латте", "Капучино", "Эспрессо"};

        for (String c : coffeeArray) {
            System.out.print(c + ", ");
        }
        System.out.println();

        final List<String> coffeeList = List.of(coffeeArray); // тут массив должен стать списком

        System.out.println(coffeeList);
    }
}