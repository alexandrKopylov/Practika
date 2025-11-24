package sprint_05.oop_Generic.lesson_5_generic_and_inheritance.task3;

// дополните объявление класса Contact
abstract class Contact {
        // класс должен содержать одно полe — имя пользователя name
       String name;

    public Contact(String name) {
        this.name = name;
    }
// и два три метода — getName(), sendMessage() для отправки сообщения и print() для печати информации о контакте

    public String getName() {
        return name;
    }
    abstract void sendMessage();
    abstract void print();

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                '}';
    }
}