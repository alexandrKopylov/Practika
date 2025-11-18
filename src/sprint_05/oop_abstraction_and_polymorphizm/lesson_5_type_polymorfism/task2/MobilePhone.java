package sprint_05.oop_abstraction_and_polymorphizm.lesson_5_type_polymorfism.task2;

public class MobilePhone extends Phone{
    public MobilePhone(String number) {
        super(number);
    }

            //объявите метод sendSms()
           public void sendSms(String messageText, String targetNumber ) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }




//    public final void makeCall(String targetNumber) {
//        System.out.println("Звоним с номера " + number);
//        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
//        System.out.println("Привет!");
//    }

}