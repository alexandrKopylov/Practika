package sprint_08.s8_1_stream.lesson_8.task1;

import java.util.Optional;

public class OptionalNameDemo {

    static Optional<String> requestUserName() {
        //Здесь должен быть запрос к пользователю, но пока его не реализовали
        //Поместите в переменную username имя пользователя или оставьте ее пустой, если имя скрыто
        String username = "";

        if (username.isBlank()) {
            //вставьте код здесь
        } else {
            //вставьте код здесь
        }
    }

    public static void main(String[] args) {
        Optional<String> maybeName = requestUserName();
        if (/*вставьте код здесь*/) {
            //вставьте код здесь
            System.out.println("Привет, " + name + "!");
        } else {
            System.out.println("Ваше право не называть имя!");
        }
    }
}