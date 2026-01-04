package sprint_07.s7_2_Exception.lesson_6.task2;



public class LimitException extends RuntimeException {
    private final int attempts;

    public LimitException(final String message, final int attempts) {
        super(message);
        this.attempts = attempts;
    }

    public int getAttempts() {
        return attempts;
    }
}