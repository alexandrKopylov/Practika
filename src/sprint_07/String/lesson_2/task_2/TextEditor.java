package sprint_07.String.lesson_2.task_2;

public class TextEditor {

    private boolean isCapsLock = false;

    public void capsLock() {
        // Здесь нужно изменить значение флага isCapsLock на противоположное
        isCapsLock = !isCapsLock;
    }

    public void print(String str) {
        // а здесь нужно распечатать строку или в верхнем регистре, или без изменений, учитывая флаг
        if (isCapsLock) {
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str);
        }
    }

    public boolean getCapsLock() {
        return isCapsLock;

    }

    public static void main(String[] args) {
        TextEditor t = new TextEditor();
       t.capsLock();
        System.out.println(t.getCapsLock());
        t.print("Syyuuuooo");
    }

}