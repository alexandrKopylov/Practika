package sprint_04.inheritance.lesson_5_word_super;

class Zvezda extends Zarya {

    public Zvezda() { // доступ к изменению конструктора запрещён
        super();
        energyConsumption = 44;
        activateModule();
    }
    // доступ к созданию новых конструкторов запрещён

    // разрешено переопределение методов
    @Override
    void activateModule() {
        super.turnSolarPanels();
    }
}