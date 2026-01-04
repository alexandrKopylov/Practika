package sprint_07.s7_2_Exception.lesson_7.task2;

public class IncorrectInputException extends Exception {
    public IncorrectInputException(String message) {
        super(message);
    }
}