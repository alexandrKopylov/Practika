package sprint_08.s8_2_time.lesson_5.task3;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

class Practicum {
    // Задайте форматирование для времени и даты в формате часы:минуты день.месяц.год
    // Пример - 12:15 02.11.21
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd.MM.yy");
    // Задайте форматирование для времени в формате часы:минуты
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

    public static void main(String[] args) {
        System.out.println("Тест №1:");
        printFlightInformation(
                "12:15 02.11.21",
                "VKO",
                "LED",
                30,
                1,
                55
        );

        System.out.println("\nТест №2:");
        printFlightInformation(
                "14:00 03.10.21",
                "SVX",
                "VVO",
                0,
                9,
                5
        );

        System.out.println("\nТест №3:");
        printFlightInformation(
                "06:00 12.12.21",
                "DME",
                "VVO",
                0,
                12,
                0
        );

        System.out.println("\nТест №4:");
        printFlightInformation(
                "23:00 29.03.22",
                "LED",
                "SVX",
                0,
                2,
                55
        );


    }

    private static void printFlightInformation(
            String formattedDepartureTime,
            String departureAirportCode,
            String arrivalAirportCode,
            int delay,
            int flightDurationHours,
            int flightDurationMinutes
    ) {
        Airport departureAirport;
        Airport arrivalAirport;
        // С помощью класса AirportDatabase получите данные об аэропортах вылета и посадки.
        // При получении исключения выведите сообщение исключения.

        try {
            departureAirport = AirportDatabase.getAirportByCode(departureAirportCode);
            arrivalAirport = AirportDatabase.getAirportByCode(arrivalAirportCode);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            return;
        }

        // Создайте экземпляр ZonedDateTime с помощью formattedDepartureTime и зоны аэропорта вылета.
        // LocalDateTime dateTime = LocalDateTime.parse(input, inputFormatter)
        LocalDateTime dateTimeDeparture = LocalDateTime.parse(formattedDepartureTime, DATE_TIME_FORMATTER);
        ZoneId id = ZoneId.of(departureAirport.getZone());
        ZonedDateTime departure = ZonedDateTime.of(dateTimeDeparture, id);


        // Выведите информацию о том, между какими городами будет перелёт.
        System.out.println("Ваш билет на рейс " + departureAirport.getCity() + " - " + arrivalAirport.getCity() + ": ");

        // Найдите продолжительность полёта.
        // Duration flightDuration = ...
        Duration flightDuration = Duration.ofSeconds(
                (flightDurationHours * 3600) + (flightDurationMinutes * 60)
        );

        // Найдите время прибытия с учётом зоны прилёта.
//                        LocalDateTime localDateTime = dateTimeDeparture.plus(flightDuration);
//                        ZonedDateTime arrival = localDateTime.atZone(ZoneId.of(arrivalAirport.getZone()));

        ZonedDateTime arrivalInDepartureZone = departure.plus(flightDuration);
        ZonedDateTime arrival = arrivalInDepartureZone.withZoneSameInstant(ZoneId.of(arrivalAirport.getZone()));

        // Заполните данные для передачи в метод печати билета.
        // Город вылета
        String departureCity = departureAirport.getCityForTicket();
        // Город прилёта
        String arrivalCity = arrivalAirport.getCityForTicket();
        // Отформатированное время прилёта
        String formattedArrivalTime = arrival.format(DATE_TIME_FORMATTER);
        // Только время вылета
        String departureTimeOnly = dateTimeDeparture.format(TIME_FORMATTER);

        printTicket(
                formattedDepartureTime,
                departureAirportCode,
                arrivalAirportCode,
                departureCity,
                arrivalCity,
                formattedArrivalTime,
                departureTimeOnly
        );

        // Добавьте проверку на случай задержки.
        if (delay > 0) {
            // Определите продолжительность задержки.
            Duration delayDuration = Duration.ofMinutes(delay);
            // Вычислите время вылета с учётом задержки.
            ZonedDateTime departureWithDelay = departure.plusMinutes(delay);
            // Вычислите время прилёта с учётом задержки.
            ZonedDateTime arrivalWithDelay = departureWithDelay.plus(flightDuration).withZoneSameInstant(ZoneId.of(arrivalAirport.getZone()));

            System.out.println("Ваш вылет задерживается.");
            // Выведите продолжительность задержки в формате часы:минуты

            long hours = delayDuration.toHours();
            int minutes = delayDuration.toMinutesPart(); // возвращает только «оставшиеся» минуты (без учёта полных часов)

            System.out.println("Задержка: " + hours + ":" + minutes);
            // Выведите отформатированное время и дату вылета с учётом задержки.
            System.out.println("Обновлённое время вылета: " + departureWithDelay.format(DATE_TIME_FORMATTER));
            // Выведите отформатированное время и дату прилёта с учётом задержки.
            System.out.println("Обновлённое время прилёта: " + arrivalWithDelay.format(DATE_TIME_FORMATTER));
        } else {
            System.out.println("Удачного полёта!");
        }
    }

    private static void printTicket(
            String departureTime,
            String departureAirportCode,
            String arrivalAirportCode,
            String departureCity,
            String arrivalCity,
            String arrivalTime,
            String departureTimeOnly
    ) {
        System.out.println(
                " _______________________________________________________\n" +
                        "|                                            |          |\n" +
                        "|  " + departureCity + "|" + departureAirportCode + "      "
                        + departureTime + "  |   " + departureAirportCode + "    |\n" +
                        "|  " + arrivalCity + "|" + arrivalAirportCode + "      "
                        + arrivalTime + "  |   " + arrivalAirportCode + "    |\n" +
                        "|                                            |          |\n" +
                        "|  BOARDING TIME   --:--      SEAT  1A       |   " + departureTimeOnly + "  |\n" +
                        "|  GATE  23                                  |   1A     |\n" +
                        "|____________________________________________|__________|");
    }
}