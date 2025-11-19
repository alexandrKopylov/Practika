package sprint_05.oop_Generic.lesson_2_generic_class.task5;

// Дополните класс для проверки трудоустроенности пользователя
public class EmploymentValidationRule ... {

public EmploymentValidationRule(Boolean value) {
    super(value, "Ипотека выдается только трудоустроенным");
}

@Override
public boolean isValid() {
    return value;
}
}