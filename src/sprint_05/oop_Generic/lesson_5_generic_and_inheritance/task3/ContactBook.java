package sprint_05.oop_Generic.lesson_5_generic_and_inheritance.task3;

import java.util.ArrayList;

// ограничьте класс ContactBook так, чтобы он мог хранить в себе только список контактов
class ContactBook<T extends Contact> {
    // объявите поле класса contacts — список контактов книги
    ArrayList<T> contacts = new ArrayList<>();

    public void addContact(T contact) {
        contacts.add(contact);
    }

    public void printList() {
        // выведите на экран весь список контактов книги
        for (T contact : contacts) {
            System.out.println("Имя: " + contact.getName());
            contact.print();
        }
    }

    public void congratulate(String name) {
        boolean contactPresented = false; // проверяем, есть ли контакт в базе
        // найдите контакт в книге по имени и отправьте ему сообщение с помощью метода sendMessage()
        for (T contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
                contact.sendMessage();
                contactPresented = true;
                break;

            }
        }

        if (!contactPresented) {
            // если контакт не найден, выведите соответствующее сообщение
            System.out.println("Не найден контакт с указанным именем.");
        }
    }

}