package sprint_05.oop_Generic.lesson_2_generic_class.task5;

public class AgeValidationRule ... {

public AgeValidationRule(Byte age) {
    super(age, "Возраст для подачи на ипотеку должен быть старше 18 лет");
}

@Override
public boolean isValid() {
    return value >= 18;
}

}
