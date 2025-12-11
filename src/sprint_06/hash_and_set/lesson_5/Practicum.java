package sprint_06.hash_and_set.lesson_5;

import java.util.ArrayList;
import java.util.List;

class Practicum {
    private static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        // создадим 1 миллион пользователей
        for (long i = 1; i <= 1_000_000L; i++) {
            users.add(new User(i, "Имя " + i));
        }

        final long startTime = System.nanoTime();
        User user = findUser(378_366L);
        final long endTime = System.nanoTime();

        System.out.println("Найден пользователь: " + user);
        System.out.println("Поиск занял " + (endTime - startTime) + " наносекунд.");
    }

    private static User findUser(Long userId) {
        for (User user : users) {
            if (user.id.equals(userId)) {
                return user;
            }
        }

        return null;
    }

    static class User {
        Long id;
        String name;

        public User(Long id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "User{id=" + id + ", name='" + name + "'}";
        }
    }
}