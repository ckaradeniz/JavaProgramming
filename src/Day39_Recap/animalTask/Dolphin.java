package Day39_Recap.animalTask;

public class Dolphin extends FriendlyAnimal {


    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void swim(){
        System.out.println(getName() + " is swimming");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating little fishes");
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