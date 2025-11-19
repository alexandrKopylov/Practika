package sprint_05.oop_Generic.lesson_2_generic_class.task4;

import java.util.ArrayList;
import java.util.HashMap;

public class Practicum {
    public static void main(String[] args) {
        //создаём двухуровневую хеш-таблицу для хранения расписания уроков
        AdvancedHashMap<String, Integer, String> timetable = new AdvancedHashMap<>();
        //добавляем уроки, с указанием дня недели и номера урока
        timetable.put("Понедельник", 1, "Русский язык");
        timetable.put("Понедельник", 2, "Математика");
        timetable.put("Вторник", 1, "Физкультура");
        timetable.put("Вторник", 2, "Русский язык");

        //выводим первый урок во вторник
        System.out.println(timetable.get("Вторник", 1));

        //получаем и выводим все уроки в понедельник
        ArrayList<String> mondayLessons = timetable.getAll("Понедельник");
        System.out.println(mondayLessons);
    }

}

class AdvancedHashMap<K, K1, V> {
    //данные будем хранить в хеш-таблице из хеш-таблиц
    HashMap<K, HashMap<K1, V>> internalHashMap = new HashMap<>();


    public void put(K key, K1 key1, V value) {
        HashMap<K1, V> innerHashMap = internalHashMap.get(key);
        if (innerHashMap == null) {
            innerHashMap = new HashMap<>();
        }
        innerHashMap.put(key1, value);
        internalHashMap.put(key, innerHashMap);
    }



    public  V get(K key, K1 key1) {
        //получаем хеш-таблицу по первому ключу
        HashMap<K1, V> innerHashMap = internalHashMap.get(key);
        if (innerHashMap == null) {
            return null;
        }
        //получаем элемент из вложенной хеш-таблицы
        return innerHashMap.get(key1);
    }

    public  ArrayList<V> getAll(K key) {
        HashMap<K1, V> innerHashMap = internalHashMap.get(key);
        if (innerHashMap == null) {
            return new ArrayList<>();
        }
        return new ArrayList<>(innerHashMap.values());
    }
}