package sprint_08.s8_1_stream.lesson_8.task2;

import java.util.stream.Stream;

public class OptionalInStreams {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .filter(number -> number % 2 == 0)
               //выбрать первый отфильтрованный элемент
                .findFirst()
                //вывести на экран найденное число либо строку "Чётное число не найдено"
                .ifPresentOrElse(
                        // если Optional не пуст
                        candy -> System.out.println(candy),
                        // если Optional пуст
                        () -> System.out.println("Чётное число не найдено")
                );

    }
}
