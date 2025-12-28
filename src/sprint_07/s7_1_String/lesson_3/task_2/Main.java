package sprint_07.s7_1_String.lesson_3.task_2;

public class Main {

    public String maskCardNumber(String cardNumber) {
     	  // реализуйте вашу версию метода здесь
String str1 = cardNumber.substring(0,4);
String str2 = cardNumber.substring(12);
return str1+ "*".repeat(8)+ str2;
    }

    public static void main(String[] args) {
        Main masker = new Main();
        System.out.println(masker.maskCardNumber("1234567890123456"));
    }

}
