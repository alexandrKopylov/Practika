package sprint_08.s8_2_time.lesson_4.task2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Practicum {
    public static final int SECONDS_IN_DAY = 60 * 60 * 24;

    public static void main(String[] args) {
        LocalDateTime firstStart = LocalDateTime.of(2099, 10, 10, 12, 5);
        LocalDateTime firstFinish = LocalDateTime.of(2099, 10, 10, 14, 15);

        LocalDateTime secondStart = LocalDateTime.of(2099, 10, 10, 12, 0);
        LocalDateTime secondFinish = LocalDateTime.of(2099, 10, 11, 15, 30);

        LocalDateTime thirdStart = LocalDateTime.of(2099, 10, 10, 23, 10);
        LocalDateTime thirdFinish = LocalDateTime.of(2099, 10, 11, 10, 25);

        printGap(firstStart, firstFinish);
        printGap(secondStart, secondFinish);
        printGap(thirdStart, thirdFinish);
    }

    private static void printGap(LocalDateTime start, LocalDateTime finish) {
        // Создаем форматировщик для нужного формата даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");

        System.out.println("Вход в гиперпространство:");
        // Форматируем и выводим время входа
        System.out.println(formatter.format(start));

        System.out.println("Выход из гиперпространства:");
        // Форматируем и выводим время выхода
        System.out.println(formatter.format(finish));

        // Вычисляем длительность между событиями
        Duration duration = Duration.between(start, finish);

        // Получаем длительность в секундах
        long seconds = duration.getSeconds();

        if (seconds >= SECONDS_IN_DAY) {
            // Вычисляем количество полных дней
            long days = duration.toDays();
            System.out.println("Дней на гиперпрыжок: " + days);
        } else {
            // Выводим длительность в минутах
            long minutes = duration.toMinutes();
            System.out.println("Минут на гиперпрыжок: " + minutes);
        }
        System.out.println();
    }
}
