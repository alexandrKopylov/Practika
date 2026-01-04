package sprint_07.s7_2_Exception.lesson_8.task1.validators;


import sprint_07.s7_2_Exception.lesson_8.task1.exceptions.ValidateException;
import sprint_07.s7_2_Exception.lesson_8.task1.exceptions.ValidatePasswordException;

public class PasswordLengthValidator implements Validator {
    private final int minLength;

    public PasswordLengthValidator(final int minLength) {
        this.minLength = minLength;
    }

    @Override
    public void validate(final String password) throws ValidatePasswordException {
        if (password == null || password.length() < minLength) {
            throw new ValidatePasswordException(
                    String.format("Пароль должен быть больше %d символов", minLength)
            );
        }
    }
}
