package sprint_08.s8_2_time.lesson_3.task2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Practicum {
    public static void main(String[] args) {
        String input = "14 часов 09 минут. Месяц: 02, День: 14, Год: 1966.";

        printCorrectDateTime(input);
    }

    private static void printCorrectDateTime(String input) {

      //  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm");

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("HH часов mm минут. Месяц: MM, День: dd, Год: yyyy."); // определите входной формат
        LocalDateTime dateTime = LocalDateTime.parse(input, inputFormatter); // сконвертируйте исходную строку в LocalDateTime

        DateTimeFormatter outputFormatter =  DateTimeFormatter.ofPattern ( "dd_MM_yyyy|HH:mm");
        //("dd.MM.yyyy, HH:mm");  //  Стало: 25.01.2026, 11:38   // определите выходной формат
        System.out.println(dateTime.format(outputFormatter)); // выведите результат на экран
    }
}