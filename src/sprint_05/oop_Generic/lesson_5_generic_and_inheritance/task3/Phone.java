package sprint_05.oop_Generic.lesson_5_generic_and_inheritance.task3;

// унаследуйте класс от базового класса, описывающего контакт Contact
class Phone ... {
private final String phoneNumber;

public Phone(String name, String phoneNumber) {
        ...
        this.phoneNumber = phoneNumber;
        }

public String getPhoneNumber() {
        return phoneNumber;
        }

        // метод sendMessage переопределяет метод базового класса
        ...
public void sendMessage() {
        System.out.println("Звоним другу по номеру " + phoneNumber + " и зовём на кофе.");
        }

        ...
public void print() {
        System.out.println("Номер телефона: " + getPhoneNumber());
        }
        }
