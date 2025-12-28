package sprint_07.s7_1_String.lesson_6.task3;

public class Palindrome {

    public boolean isPalindromeWord(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}