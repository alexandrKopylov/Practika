package sprint_08.s8_2_time.lesson_5.task3;

class AirportDatabase {
    private static Airport vnukovo = new Airport(
            "Внуково",
            "Москва",
            "MOSCOW          ",
            "Europe/Moscow"
    );

    private static Airport pulkovo = new Airport(
            "Пулково",
            "Санкт-Петербург",
            "SAINT-PETERSBURG",
            "Europe/Moscow"
    );

    private static Airport vladivostok = new Airport(
            "Владивосток",
            "Владивосток",
            "VLADIVOSTOK     ",
            "Asia/Vladivostok"
    );

    private static Airport koltsovo = new Airport(
            "Кольцово",
            "Екатеринбург",
            "YEKATERINBURG   ",
            "Asia/Yekaterinburg"
    );

    public static Airport getAirportByCode(String airportCode) {
        /* С помощью оператора switch case верните правильный аэропорт по его коду:
         * VKO - vnukovo
         * LED - pulkovo
         * SVX - koltsovo
         * VVO - vladivostok
         * Для неверного кода пробросьте исключение.
         */

        Airport result;
        switch (airportCode) {
            case "VKO":
                result = AirportDatabase.vnukovo;
                break;
            case "LED":
                result = AirportDatabase.pulkovo;
                break;
            case "SVX":
                result = AirportDatabase.koltsovo;
                break;
            case "VVO":
                result = AirportDatabase.vladivostok;
                break;
            default:
                throw new IllegalStateException("Неизвестный код аэропорта: " + airportCode);
        }
        return result;
    }
}