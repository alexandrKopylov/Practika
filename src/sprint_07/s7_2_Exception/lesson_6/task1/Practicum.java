package sprint_07.s7_2_Exception.lesson_6.task1;

// допишите код UserInputException

public class Practicum {
    public static void main(final String[] args) {
        final UserInputException userInputException = new UserInputException("Ошибка ввода!");
        System.out.println(userInputException.getMessage());
    }
}
 class UserInputException extends Exception {
    public UserInputException() {
        super();
    }
    public UserInputException(final String message) {
        super(message);
    }
}