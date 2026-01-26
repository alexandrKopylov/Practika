package sprint_08.s8_2_time.lesson_5.task1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

class Watch {
    private ZonedDateTime currentTime;
    private int numOfZone;
    private final List<String> zones = Arrays.asList("America/New_York", "Asia/Vladivostok", "Europe/Moscow");

    public Watch() {
        numOfZone = 0;
        ZoneId zone = ZoneId.of(zones.get(numOfZone));
        LocalDateTime dateTime = LocalDateTime.of(2021, 1, 26, 0, 0);
        currentTime = ZonedDateTime.of(dateTime, zone);
    }

    public void changeTimeZone() {
        numOfZone = ...;
        ZoneId newZone = ZoneId.of(zones.get(numOfZone));
        // смените временную зону (время должно остаться прежним)
        ...
    }

    public void addTenHours() {
        // увеличьте текущее время на 10 часов
        ...
    }

    public void addHour() {
        // увеличьте текущее время на 1 час
        ...
    }

    public void addTenMinutes() {
        // увеличьте текущее время на 10 минут
        ...
    }

    public void addMinute() {
        // увеличьте текущее время на 1 минуту
        ...
    }

    public ZonedDateTime getCurrentTime() {
        // верните текущее время
        ...
    }
}

class Practicum {
    public static void main(String[] args) {
        Watch watch = new Watch();

        // настройка часов

        System.out.println(watch.getCurrentTime());
    }
}