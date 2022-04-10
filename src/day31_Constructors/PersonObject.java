package day31_Constructors;

public class PersonObject {

    public static void main(String[] args) {


        Person person1 = new Person("Daniel", 'M', 32);

        Person person2 = new Person("Ksenia", 'F', 28);

        person2.age = 30;

        System.out.println(person1);//Person{name='Daniel', gender=M, age=32}
        System.out.println(person2);//Person{name='Ksenia', gender=F, age=30}




    }
}
