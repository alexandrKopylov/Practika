package sprint_10.s10_4_annotation.lesson_6.task1;


import java.lang.reflect.Method;

public class Practicum {
    public void getData(String str, int num) {
        // реализация метода
    }

    public void printLog() {
        // реализация метода
    }

    public static void main(String[] args) {
        try {
            // получение конкретного метода
            Method method = Practicum.class.getMethod("getData", String.class, int.class);
            System.out.println("Метод: " + method);

            // получение всех методов
            Method[] methods = Practicum.class.getMethods();
            System.out.println("Все методы:");
            for (Method m : methods) {
                System.out.println(m);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}