package sprint_05.oop_Generic.lesson_5_generic_and_inheritance.task3;

// ограничьте класс ContactBook так, чтобы он мог хранить в себе только список контактов
class ContactBook ... {
        // объявите поле класса contacts — список контактов книги
        ...

public void addContact(... contact) {
        contacts.add(contact);
        }

public void printList() {
        // выведите на экран весь список контактов книги
        ...
        System.out.println("Имя: " + contact.getName());
        contact.print();
        }

public void congratulate(String name) {
        boolean contactPresented = false; // проверяем, есть ли контакт в базе
        // найдите контакт в книге по имени и отправьте ему сообщение с помощью метода sendMessage()
        ...
        System.out.println("Поздравим с Новым годом ваш контакт из записной книжки: " + name);
        contact.sendMessage();

        // если контакт не найден, выведите соответствующее сообщение
        System.out.println("Не найден контакт с указанным именем.");
        }

        }