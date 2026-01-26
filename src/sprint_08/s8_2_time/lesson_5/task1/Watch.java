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
        //Также корректный вариант — numOfZone = (numOfZone + 1) % 3
        numOfZone = (numOfZone + 1) % zones.size();
        ZoneId newZone = ZoneId.of(zones.get(numOfZone));
        currentTime = currentTime.withZoneSameLocal(newZone);
    }

    public void addTenHours() {
        currentTime = currentTime.plusHours(10);
    }

    public void addHour() {
        currentTime = currentTime.plusHours(1);
    }

    public void addTenMinutes() {
        currentTime = currentTime.plusMinutes(10);
    }

    public void addMinute() {
        currentTime = currentTime.plusMinutes(1);
    }

    public ZonedDateTime getCurrentTime() {
        return currentTime;
    }
}

class Practicum {
    public static void main(String[] args) {
        Watch watch = new Watch();

        watch.changeTimeZone();
        watch.changeTimeZone();

        watch.addTenHours();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();
        watch.addHour();

        watch.addTenMinutes();
        watch.addTenMinutes();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();
        watch.addMinute();

        System.out.println(watch.getCurrentTime());
    }
}