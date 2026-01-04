package sprint_07.s7_2_Exception.lesson_7.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

class Practicum {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IncorrectInputException, TooMuchPizzaException, NotEnoughPizzaException {
        final PizzaStorage storage = new PizzaStorage(10);
        printActionMenu();
        String action = scanner.nextLine();
        while (!"exit".equals(action)) {
            if ("show".equals(action)) {
                System.out.println("Количество пиццы на складе: " + storage.getPizzaCount());
            } else if ("add".equals(action)) {
                add(storage);
            } else if ("take".equals(action)) {
                take(storage);
            }
            action = scanner.nextLine();
        }
    }

    public static void add(final PizzaStorage storage) throws IncorrectInputException, TooMuchPizzaException {

            final int count = getPositiveNumber("Введите количество пиццы для добавления => ");
            storage.addPizza(count);

    }

    public static void take(final PizzaStorage storage) throws IncorrectInputException, NotEnoughPizzaException {

            final int count = getPositiveNumber("Введите количество пиццы для удаления => ");
            storage.takePizza(count);

    }

    public static int getPositiveNumber(final String hint) throws IncorrectInputException {
        System.out.println(hint);
        try {
            final int count = scanner.nextInt();
            if (count <= 0) {
                throw new IncorrectInputException("Число должно быть больше 0");
            }
            return count;
        } catch (InputMismatchException exception) {
            throw new IncorrectInputException("Введено не число");
        }
    }

    public static void printActionMenu() {
        System.out.println("add - добавить пиццу на склад");
        System.out.println("take - взять пиццу со склада");
        System.out.println("show - показать количество на складе");
        System.out.println("exit - выход");
        System.out.print("Введите действие => ");
    }

}