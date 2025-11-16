package sprint_05.oop_abstraction_and_polymorphizm.lesson_1_abstract_class.task_3;

public class Dog extends Pet{

    public Dog() {
        super("gav");
       this.setPawsCount(4);
    }

    public void bringStick(){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
