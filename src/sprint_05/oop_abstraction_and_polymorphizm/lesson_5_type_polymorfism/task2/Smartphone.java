package sprint_05.oop_abstraction_and_polymorphizm.lesson_5_type_polymorfism.task2;

public class Smartphone extends MobilePhone {
    public Smartphone(String number) {
        super(number);
    }

     //объявите метод sendEmail()
    public void sendEmail(String messageText,String email ) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }


   public void makeCall(String targetNumber, String appName) {
       System.out.println("Позвоним через приложение "+appName+" по номеру " + targetNumber);
    }


//    public void sendSms(String messageText, String targetNumber ) {
//        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
//    }




//    public final void makeCall(String targetNumber) {
//        System.out.println("Звоним с номера " + number);
//        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
//        System.out.println("Привет!");
//    }


}
