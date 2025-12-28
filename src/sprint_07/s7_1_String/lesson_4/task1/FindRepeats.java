package sprint_07.s7_1_String.lesson_4.task1;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {

        int result = 0;
        while (text.contains(substring)) {
            result++;
            int index = text.indexOf(substring);
            int index2 = index + substring.length();
            text = text.substring(index2);
            index = 0;
            index2 = 0;
        }

        return result;
    }
}
