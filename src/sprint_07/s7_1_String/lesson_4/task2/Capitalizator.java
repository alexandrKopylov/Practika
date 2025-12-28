package sprint_07.s7_1_String.lesson_4.task2;

public class Capitalizator {
    public String capitalize(String str) {

        String leter = str.substring(0, 1);
        String textEnd = str.substring(1);
        return leter.toUpperCase() + textEnd;
    }
}