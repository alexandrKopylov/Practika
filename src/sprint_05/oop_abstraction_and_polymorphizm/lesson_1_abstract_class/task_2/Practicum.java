package sprint_05.oop_abstraction_and_polymorphizm.lesson_1_abstract_class.task_2;

abstract class PaymentProcessor {
    public final void processPayment() {
        System.out.println("Начинаю обрабатывать транзакцию.");
        // Добавьте вызовы соответствующих методов
        verifyDetails();
        makePayment();
        sendNotification();
    }

    protected abstract void makePayment();

    private void verifyDetails() {
        System.out.println("Данные проверены.");
    }

    private void sendNotification() {
        System.out.println("Уведомление отправлено.");
    }
}

class MirCardPayment extends PaymentProcessor {
    @Override
    protected void makePayment() {
        System.out.println("Оплата через карту Мир.");
    }
}

class SbpPayment extends PaymentProcessor {
    // Реализуйте абстрактный метод родительского класса
    @Override
    protected void makePayment() {
        System.out.println("Оплата через Сервис Быстрых Платежей.");
    }
}

public class Practicum {
    public static void main(String[] args) {
        MirCardPayment mir = new MirCardPayment();
        SbpPayment sbp = new SbpPayment();

        // Вызовите методы обработки транзакции
        // для оплаты сначала по СБП, а затем по карте Мир
        sbp.processPayment();
        mir.processPayment();

        //итог :  здесь рнализован патерн "шаблонный метод"
        //processPayment()  является шаблоном
    }
}