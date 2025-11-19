package sprint_05.oop_Generic.lesson_2_generic_class.task1;

class Box <T> {
private final T item;

public Box(T item) {
    this.item = item;
}

public T getItem() {
    return item;
}
}

public class Practicum {
    public static void main(String[] args) {
        Box<String> message = new Box<>("Привет!");
        System.out.println(message.getItem());

        Box<Integer> number = new Box<>(42);
        System.out.println(number.getItem());
    }
}