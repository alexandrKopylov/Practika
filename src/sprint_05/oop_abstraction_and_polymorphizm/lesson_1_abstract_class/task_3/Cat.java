package sprint_05.oop_abstraction_and_polymorphizm.lesson_1_abstract_class.task_3;

public class Cat extends Pet{


    public Cat() {
        super("mya");
       this.setPawsCount(4);
    }

    public void catchMouse(){
        System.out.println("Поймала мышку!");
    }


}
