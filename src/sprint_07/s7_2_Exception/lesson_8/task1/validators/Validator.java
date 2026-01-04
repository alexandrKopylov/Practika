package sprint_07.s7_2_Exception.lesson_8.task1.validators;


import sprint_07.s7_2_Exception.lesson_8.task1.exceptions.ValidateException;

public interface Validator {
    void validate(String value) throws ValidateException;
}