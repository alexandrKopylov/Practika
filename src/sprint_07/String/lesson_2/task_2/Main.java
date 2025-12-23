package sprint_07.String.lesson_2.task_2;

public class Main {
   public static void main(String[] args) {
        System.out.println("Так много методов!".indexOf("м", 3) == 4);
        System.out.println("Как их все запомнить?!".charAt("Как их все запомнить?!".indexOf("?"))  == '?');
        System.out.println("Шиншилла".lastIndexOf("ш")+ 1 == 4);

    }
}
//        System.out.println("Как их все запомнить?!". ...  == '?');
//6
//        System.out.println("Шиншилла". ...  == 4);
//7
//    }
//8
//}
//Вам нужны методы charAt(index), indexOf(char), lastIndexOf(char).
// Чтобы выбрать между методами indexOf(char) и lastIndexOf(char), нужно определить, с какой стороны символ встречается раньше.