package sprint_05.oop_Generic.lesson_2_generic_class.task2;

class MapEntry<K, V> {
    private final K key;
    private V value;

    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V newValue) {
        this.value = newValue;
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
