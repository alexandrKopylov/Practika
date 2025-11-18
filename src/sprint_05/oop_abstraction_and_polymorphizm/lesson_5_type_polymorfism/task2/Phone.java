package sprint_05.oop_abstraction_and_polymorphizm.lesson_5_type_polymorfism.task2;

public abstract class Phone {
    private final String number;

    public Phone(String number) {
        this.number = number;
    }

    public final void makeCall(String targetNumber) {
        System.out.println("Звоним с номера " + number);
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    }
}
