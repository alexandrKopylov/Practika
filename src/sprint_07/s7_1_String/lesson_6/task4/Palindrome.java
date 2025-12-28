package sprint_07.s7_1_String.lesson_6.task4;

public class Palindrome {
    public boolean isPalindromeLine(String str) {
        StringBuilder sb = new StringBuilder(str.trim().toLowerCase().replace(" ", ""));

        String str3 = str.trim().toLowerCase().replace(" ", "");
        String str4 = sb.reverse().toString();

        System.out.println(str3);
        System.out.println(str4);

        return str.trim().toLowerCase().replace(" ", "").equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(  p.isPalindromeLine("Молебен о коне белом"));
    }

}