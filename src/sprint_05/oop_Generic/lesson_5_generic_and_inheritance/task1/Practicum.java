package sprint_05.oop_Generic.lesson_5_generic_and_inheritance.task1;

import java.util.ArrayList;

public class Practicum {
    public static void main(String[] args) {
        GuestsList<Guest> guests = new GuestsList<>();
        guests.add(new Guest("Семён", "Гостев"));
        guests.add(new Guest("Вера", "Иванова"));

        GuestsList<VipGuest> vips = new GuestsList<>();
        vips.add(new VipGuest("Мария", "Важнова"));
        vips.add(new VipGuest("Александр", "Яблонев"));

        giveSouvenirs(guests); // этот вызов сработает

        // ...а этот вызов приведёт к ошибке
         giveSouvenirs(vips);  // ошибка компиляции: incompatible types  при  giveSouvenirs(GuestsList<Guest> guests)
    }

   // static void giveSouvenirs(GuestsList<Guest> guests) {
   static void giveSouvenirs(GuestsList<? /*extends Guest*/> guests) {
        for (Guest g : guests.getAll()) {
            System.out.println("Подарок для " + g.getDescription());
        }
    }

    void addToSpecialTable(GuestsList<? super VipGuest> guests, VipGuest vip) {
        // GuestsList<? super VipGuest> — это список, тип которого неизвестен, но он
        // является родителем VipGuest (например: VipGuest, Guest или Object).
        // Поэтому мы можем добавлять только объекты типа VipGuest и его подклассов — они точно подойдут.
        guests.add(vip);

        // а вот так уже нельзя — будет ошибка компиляции
       //  guests.add(new Guest("Семён", "Гостев"));
    }


}

class Guest {

    String name;
    String surname;

    public Guest(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getDescription() {
        return "Гость: " + name + " " + surname;
    }
}

class VipGuest extends Guest {
    public VipGuest(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String getDescription() {
        return "VIP-гость: " + name + " " + surname;
    }
}

class GuestsList<T extends Guest> {
    ArrayList<T> guests = new ArrayList<>();

    public void add(T guest) {
        guests.add(guest);
    }

    public ArrayList<T> getAll() {
        return guests;
    }

    public void printGuests() {
        for (T guest : guests) {
            System.out.println(guest.getDescription());
        }
    }
}