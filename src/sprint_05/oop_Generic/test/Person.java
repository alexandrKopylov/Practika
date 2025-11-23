package sprint_05.oop_Generic.test;

class Person<T>{

    private T id;
    private String name;

    T getId(){ return id; }
    void setId(T id){ this.id = id; }

    String getName() { return name; }

    Person(T id, String name){

        this.id = id;
        this.name = name;
    }
}