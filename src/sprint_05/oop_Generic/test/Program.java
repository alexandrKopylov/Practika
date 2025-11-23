package sprint_05.oop_Generic.test;

//public class Program{
//
//    public static void main(String[] args) {
//
//        Person<Object> bob = new Person<>(2.0, "Bob");
//        Person<Integer> tom = new Person<>(1, "Tom");
//        Person<String> sam = new Person<>("F-456", "Sam");
//
//        printPersonInfo(bob);
//       // printPersonInfo(tom); // ! ОШибка:  tom - НЕ представляет тип Person<Object>
//       // printPersonInfo(sam); // ! ОШибка:  sam - НЕ представляет тип Person<Object>
//    }
//
//    static void printPersonInfo(Person<Object> person) {
//
//        System.out.print("Name: " + person.getName());
//        Object id = person.getId();
//        System.out.println(";  Id: " + id);
//    }
//}


public class Program{

    public static void main(String[] args) {

     //   Person<Integer> pInt = new Person<>(1, "Tom");
      //  Person<Number> pNum = new Person<>(2.0, "Bob");
        Person<Object> pObj = new Person<>("F-456", "Sam");

      //  setIntegerId(pInt, 100); // OK
       // setIntegerId(pNum, 200); // OK
        setIntegerId(pObj, 300); // OK

        // проверка
       // System.out.println("pInt Id: " + pInt.getId()); // pInt Id: 100
      //  System.out.println("pNum Id: " + pNum.getId()); // pNum Id: 200
        System.out.println("pObj Id: " + pObj.getId()); // pObj Id: 300
    }
    static void setIntegerId(Person<? super Integer> person, int newId) {
        // Мы можем безопасно "записать" Integer,
        // так как любой супертип Integer сможет его принять.
        person.setId(newId);
    }
}