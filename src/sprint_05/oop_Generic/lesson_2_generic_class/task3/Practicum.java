package sprint_05.oop_Generic.lesson_2_generic_class.task3;

import java.util.ArrayList;

class Bag<T> {
    private ArrayList<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public ArrayList<T> getAll() {
        return items;
    }

    public int size() {
        return items.size();
    }
}

public class Practicum {
    public static void main(String[] args) {
        Bag<String> bag = new Bag<>();
        bag.add("яблоко");
        bag.add("груша");
        System.out.println(bag.getAll()); // [яблоко, груша]
        System.out.println(bag.size());   // 2
    }
}
