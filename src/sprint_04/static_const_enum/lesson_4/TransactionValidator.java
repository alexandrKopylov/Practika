package sprint_04.static_const_enum.lesson_4;

public class TransactionValidator {
    // объявите константы
    public static final double MIN_AMOUNT = 1.0;
    public static final double MAX_AMOUNT = 5000.0;



    public static boolean isValidAmount(double amount) {
        if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }


/*
    // объявите метод isValidAmount()
    static public boolean isValidAmount(double amount) {
        if (amount < MIN_AMOUNT) {
            // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");
            return false;
        }
        return true;
    }

    */
}
