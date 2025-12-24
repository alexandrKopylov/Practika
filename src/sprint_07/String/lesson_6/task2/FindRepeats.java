package sprint_07.String.lesson_6.task2;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {

        StringBuilder sb = new StringBuilder(text);
        int count = 0;
        while (sb.indexOf(substring) != -1) {
            count++;
          int index = sb.indexOf(substring);
          sb = sb.delete(0, index + substring.length());
        }
        return count;
    }

    public  static void main(String[] args) {
        FindRepeats fr = new FindRepeats();
        int r = fr.numberOfRepeats("Маша мыло мыло" , "мыло");
        System.out.println(r);

    }
}