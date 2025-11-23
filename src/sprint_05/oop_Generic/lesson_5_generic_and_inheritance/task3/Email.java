package sprint_05.oop_Generic.lesson_5_generic_and_inheritance.task3;

// унаследуйте класс от базового класса, описывающего контакт Contact
class Email ... {
private final String email;

public Email(String name, String email) {
        ...
        this.email = email;
        }

public String getEmail() {
        return email;
        }

        // метод sendMessage переопределяет метод базового класса
        ...
public void sendMessage() {
        System.out.println("Отправим новогоднюю картинку коллеге на электронную почту " + email);
        }

        ...
public void print() {
        System.out.println("Email: " + getEmail());
        }
        }