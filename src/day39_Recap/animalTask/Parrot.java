package day39_Recap.animalTask;

public class Parrot extends FriendlyAnimal{


    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating parrot food");
    }

    public void fly(){
        System.out.println(getName() + " is flying");
    }
    public void sing(){
        System.out.println(getName() + " is singing");
    }
}
/*
 Create the following sub classes of FriendlyAnimal and Override the eat method
			1. Dog:
					Extra methods:
						bark()

			2. Cat:
					Extra methods:
						scratch()
						meow()

			3. Dolphin:
					Extra methods:
						swim()

			4. Parrot:
					Extra methods:
						fly()
						sing()
 */