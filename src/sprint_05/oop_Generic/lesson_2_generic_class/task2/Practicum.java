package sprint_05.oop_Generic.lesson_2_generic_class.task2;

class MapEntry ... {
private final ... key;
private ... value;

public MapEntry(...) {
    this.key = key;
    this.value = value;
}

public ... getKey() {
        ...
}

public ... getValue() {
        ...
}

public void setValue(... newValue) {
        ...
}
}

public class Practicum {
    public static void main(String[] args) {
        MapEntry<String, String> contact = new MapEntry<>("Анна", "+79991234567");
        System.out.println(contact.getKey());
        System.out.println(contact.getValue());

        contact.setValue("+79997654321");
        System.out.println(contact.getValue());
    }
}
