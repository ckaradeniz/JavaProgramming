package day33_Statics.PracticeTasks;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("Muharrem", 31, 'M');

        System.out.println(person1);

        person1.eat("fish");

        person1.drink("orange juice");

        person1.sleep();


    }
}
