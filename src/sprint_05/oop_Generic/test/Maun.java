package sprint_05.oop_Generic.test;

import java.util.ArrayList;

public class Maun {
    public static void main(String[] args) {
        GuestsList<Guest> guestsAtSpecialTable = new GuestsList<>();

       // addToSpecialTable(guestsAtSpecialTable, new VipGuest("Мария", "Важнова"));
      //  addToSpecialTable(guestsAtSpecialTable, new PremiumGuest("Иван", "Семёнович", "Шустриков"));
        addToSpecialTable(guestsAtSpecialTable, new Vajnii("Иван", "Семёнович", "ttt"));

    }
    static void addToSpecialTable(GuestsList<? super Vajnii> guests, Vajnii vip) {
   // static void addToSpecialTable(GuestsList<? super PremiumGuest> guests, PremiumGuest vip) {
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

class Vajnii extends PremiumGuest {
    public Vajnii(String name, String middleName, String surname) {
        super(name, middleName, surname);
    }

    @Override
    public String getDescription() {
        return "Vajnii-гость: " + name + " " + middleName;
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