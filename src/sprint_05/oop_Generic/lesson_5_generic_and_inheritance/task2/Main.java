package sprint_05.oop_Generic.lesson_5_generic_and_inheritance.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GuestsList<Guest> guestsAtSpecialTable = new GuestsList<>();

        addToSpecialTable(guestsAtSpecialTable, new VipGuest("Мария", "Важнова"));
        addToSpecialTable(guestsAtSpecialTable, new PremiumGuest("Иван", "Семёнович", "Шустриков"));
       // addToSpecialTable(guestsAtSpecialTable, new Guest("Иван", "Семёнович"));
    }

    static void addToSpecialTable(GuestsList<? super VipGuest> guests, VipGuest vip) {
        guests.add(vip);
        System.out.println(vip.getDescription() + " сидит за особым столом");
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

class PremiumGuest extends VipGuest {
    String middleName;

    public PremiumGuest(String name, String middleName, String surname) {
        super(name, surname);
        this.middleName = middleName;
    }

    @Override
    public String getDescription() {
        return "PREMIUM-гость: " + name + " " + middleName;
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