package Day39_Recap.animalTask;

public class Zoo {

    public static void main(String[] args) {


        Dog dog = new Dog("a", "b" ,'M', 2, "Medium", "white");

        System.out.println(dog);

        dog.setAge(4);

        System.out.println(dog);

        dog.eat();
        dog.sleep();
        dog.bark();

        dog.setAge(-4);
        System.out.println(dog);



        Lion lion =new Lion ("d", "e", 'F', 5, "Large", "yellow");

        System.out.println(lion);

        lion.setName("Aslan Kral");

        System.out.println(lion);

        lion.eat();
        lion.hunt();


    }

}
/*
6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes
 */