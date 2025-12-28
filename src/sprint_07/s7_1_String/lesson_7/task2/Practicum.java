package sprint_07.s7_1_String.lesson_7.task2;

public class Practicum {
    public static void main(String[] args) {
        String[] rainbow = new String[]{
                "Красный",
                "Оранжевый",
                "Жёлтый",
                "Зелёный",
                "Голубой",
                "Синий",
                "Фиолетовый"
        };

         String join = String.join(", ", rainbow);

        System.out.println(join);
    }
}