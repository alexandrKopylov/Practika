package sprint_05.oop_abstraction_and_polymorphizm.lesson_4_polymorfism.task1;

public class Practicum {
    static void main() {
        MailClient mailClient; // объявили переменную с типом интерфейса MailClient
int currentCentury = 10;


        if(currentCentury < 20) {
            // присваиваем переменной в качестве значения объект класса Dove
            mailClient = new Dove();
        } else {
            // присваиваем переменной в качестве значения объект класса Telegraph
            mailClient = new Telegraph();
        }

// конкретный тип объекта не важен, если он реализует
// интерфейс MailClient, потому что у него есть метод send()
        mailClient.send("gdghdg", "sgfrgdr","gerrh");
    }
}

 class Telegraph implements MailClient {
    @Override
    public void send(String from, String to, String text) {
        System.out.println("Телеграф передал для " + to + " от " + from + " коды букв с посланием: " + text);
    }

     @Override
     public void recieve() {
         System.out.println("Телеграф напечатал ответное сообщение.");
     }


}

 class Dove implements MailClient {
    @Override
    public void send(String from, String to, String text) {
        System.out.println("Голубь полетел к " + to + " от " + from + " с письмом: " + text);
    }

     @Override
     public void recieve() {
         System.out.println("Голубь вернулся с ответным письмом!");
     }



}

 interface MailClient {
    void send(String from, String to, String text);
    void recieve();
}