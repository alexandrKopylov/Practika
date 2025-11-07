package sprint_04.Object.lesson_2;

import java.util.ArrayList;

 class LostAndFoundOffice {
    // создайте список things
    ArrayList<Object> things = new ArrayList<>();

    // реализуйте метод put()
    public void put(Object object) {
        things.add(object);
    }

    // реализуйте метод check()
    public boolean check(Object target) {
        for (Object object : things) { // логика проверки вещи в списке
            if (object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}