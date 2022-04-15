package Day39_Recap.animalTask;

public class FriendlyAnimal extends Animal {

    public static boolean isWild = false;
    public static boolean isFriendly = true;
    public static boolean isPlayable = true;

    public FriendlyAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void play(){
        System.out.println(getName() + " is playing");
    }
    public void pet(){
        System.out.println(getName() + " likes being petted");

    }
}
/*
Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()

 */