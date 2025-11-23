package sprint_05.oop_Generic.lesson_5_generic_and_inheritance.task3;

// унаследуйте класс от базового класса, описывающего контакт Contact
class Address ... {
private final String city;
private final String address;

public Address(String name, String city, String address) {
        ...
        this.city = city;
        this.address = address;
        }

public String getCity() {
        return city;
        }

public String getAddress() {
        return address;
        }

        // метод sendMessage переопределяет метод базового класса
        ...
public void sendMessage() {
        System.out.println("Отправим открытку в город " + city + " по адресу: " + address);
        }

        ...
public void print() {
        System.out.println("Город: " + getCity());
        System.out.println("Адрес: " + getAddress());
        }

        }