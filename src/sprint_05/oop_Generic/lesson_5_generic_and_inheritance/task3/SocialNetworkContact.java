package sprint_05.oop_Generic.lesson_5_generic_and_inheritance.task3;

// унаследуйте класс от базового класса, описывающего контакт Contact
class SocialNetworkContact ... {
private final String socialNetwork;
private final String username;

public SocialNetworkContact(String name, String socialNetwork, String username) {
        ...
        this.socialNetwork = socialNetwork;
        this.username = username;
        }

public String getSocialNetwork() {
        return socialNetwork;
        }

public String getUsername() {
        return username;
        }

        // метод sendMessage переопределяет метод базового класса
        ...
public void sendMessage() {
        System.out.println("Отправим забавный стикер одногруппнику в соцсети " + socialNetwork + ", имя пользователя " + username);
        }

        ...
public void print() {
        System.out.println("Социальная сеть: " + socialNetwork);
        System.out.println("Имя пользователя: " + username);
        }
        }