package sprint_05.oop_abstraction_and_polymorphizm.lesson_1_abstract_class.task_3;

public abstract class Pet {
    private int pawsCount;
    private String voice;

    public Pet( String voice) {

        this.voice = voice;
    }

    public void sleep(){
       System.out.println("Сплю");
   }

   public void play(){
       System.out.println("Играю");
   }
    public  void giveVoice(){
        System.out.println(voice);
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
}
