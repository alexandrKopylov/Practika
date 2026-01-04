package sprint_07.s7_2_Exception.lesson_8.task1.validators;

import sprint_07.s7_2_Exception.lesson_8.task1.exceptions.ValidateException;
import sprint_07.s7_2_Exception.lesson_8.task1.exceptions.ValidateNameException;
import sprint_07.s7_2_Exception.lesson_8.task1.exceptions.ValidatePasswordException;

public class NameValidator implements Validator {
    // допишите код класса
    @Override
    public void validate(String value) throws ValidateNameException {
        if (value == null && value.isBlank()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
}
