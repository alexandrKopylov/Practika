//package sprint_05.oop_Generic.lesson_4_generic.task1;
//
//import java.util.ArrayList;
//
//public class Practicum {
//    public static void main(String[] args) {
//        // Создайте список мастер-класса для продвинутых участников
//        ??? list = new WorkshopList<>();
//
//        // Регистрируем нескольких участников
//        list.register(new AdvancedParticipant("Мария", "CERT-001", "CARD-1001"));
//        list.register(new AdvancedParticipant("Александр", "CERT-002", "CARD-1002"));
//
//        // Печатаем всех участников
//        System.out.println("=== Все участники ===");
//        list.printAll();
//    }
//}
//
///* БАЗОВЫЙ КЛАСС */
//
//class Participant {
//    private String name;
//
//    public Participant(String name) {
//        this.name = name;
//    }
//
//    public String getInfo() {
//        return "Участник: " + name;
//    }
//}
//
//// Маркерные интерфейсы для допуска на мастер-класс
//interface HasCertificate {
//    String getCertificateId();
//}
//
//interface HasCard {
//    String getCardNumber();
//}
//
///**
// * Продвинутый участник
// * Допишите его реализацию
// */
//
//class AdvancedParticipant ??? {
//private String certificateId;
//private String cardNumber;
//
//public AdvancedParticipant(String name, String certificateId, String cardNumber) {
//    super(name);
//    this.certificateId = certificateId;
//    this.cardNumber = cardNumber;
//}
//
//@Override
//public String getCertificateId() {
//    return certificateId;
//}
//
//@Override
//public String getCardNumber() {
//    return cardNumber;
//}
//}
//
///* ОБОБЩЁННЫЙ СПИСОК С ОГРАНИЧЕНИЕМ */
//
///**
// * Допускаются только те типы, которые:
// *  - наследуются от Participant
// *  - реализуют HasCertificate и HasCard
// */
//class WorkshopList ??? {
//private final ??? participants = new ArrayList<>();
//
///**
// * Регистрирует участника и печатает подтверждение
// */
//public void register(??? participant) {
//    // Используем методы из базового класса и интерфейсов:
//    System.out.println("Зарегистрирован: " + participant.getInfo());
//    System.out.println("  Сертификат: " + participant.getCertificateId() + ", Карта: " + participant.getCardNumber());
//    participants.add(participant);
//}
///**
// * Печатает всех участников мастер-класса
// */
//public void printAll() {
//    for (??? p : participants) {
//        System.out.println(p.getInfo()
//                + " [cert=" + p.getCertificateId()
//                + ", card=" + p.getCardNumber() + "]");
//    }
//}
//}