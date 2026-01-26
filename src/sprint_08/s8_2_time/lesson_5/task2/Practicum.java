package sprint_08.s8_2_time.lesson_5.task2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;




class Practicum {
    public static void main(String[] args) {
        Instant now = Instant.now();

        // Указываем корректный формат вывода даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy; HH:mm:ss. ZZZZZ");

        // Создаём экземпляр ZoneId для Москвы
        ZoneId moscowZone = ZoneId.of("Europe/Moscow");
        ZonedDateTime moscowDateTime = ZonedDateTime.ofInstant(now, moscowZone);

        printTime(formatter, moscowDateTime, "Москва");

        convertAndPrintTime(formatter, moscowDateTime, "Осло", "Europe/Oslo");
        convertAndPrintTime(formatter, moscowDateTime, "Чикаго", "America/Chicago");
        convertAndPrintTime(formatter, moscowDateTime, "Шанхай", "Asia/Shanghai");
        convertAndPrintTime(formatter, moscowDateTime, "Аддис-Абеба", "Africa/Addis_Ababa");
    }

    private static void convertAndPrintTime(DateTimeFormatter formatter, ZonedDateTime moscowDateTime, String cityName, String region) {
        // Создаём ZoneId из региона
        ZoneId newZone = ZoneId.of(region);
        // Изменяем временную зону у moscowDateTime
        ZonedDateTime newDateTime = moscowDateTime.withZoneSameInstant(newZone);

        printTime(formatter, newDateTime, cityName);
    }

    private static void printTime(DateTimeFormatter formatter, ZonedDateTime dateTime, String cityName) {
        System.out.println(cityName + ":");
        // Выводим dateTime в указанном формате
        System.out.println(formatter.format(dateTime));
    }
}
