package sprint_08.s8_2_time.lesson_5.task3;

class Airport {
    private final String name;
    private final String city;
    private final String cityForTicket;
    private final String zoneName;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCityForTicket() {
        return cityForTicket;
    }

    public String getZone() {
        return zoneName;
    }

    public Airport(String name, String city, String cityForTicket, String zoneName) {
        this.name = name;
        this.city = city;
        this.cityForTicket = cityForTicket;
        this.zoneName = zoneName;
    }
}