package sprint_05.oop_abstraction_and_polymorphizm.lesson_1_abstract_class.task_3;

public class Hamster extends Pet{
    public Hamster() {
        super("xru");
        this.setPawsCount(4);
    }

    public void   hideFood(){
      System.out.println("Вся еда — в щёчках!");
  }
}
