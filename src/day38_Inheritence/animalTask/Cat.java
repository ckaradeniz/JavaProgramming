package day38_Inheritence.animalTask;

public class Cat extends Animal{


    public Cat(String name, String breed, int age, char gender, String size, String color) {
        super(name, breed, age, gender, size, color);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats cat food");
    }
}
